package com.hwae.service;

import com.hwae.dao.UserRepository;
import com.hwae.dto.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * 회원가입
     */
    public Long join(User user) {
        validateDuplicateUser(user); // 중복 회원 검증
        userRepository.save(user);
        return user.getUserId();
    }

    private void validateDuplicateUser(User user) {
        userRepository.findUserByNickName(user.getNickName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 닉네임입니다.");
                });
    }

    /**
     * 전체 회원 조회
     */
    public List<User> findUsers() {
        return userRepository.findAll();
    }
}

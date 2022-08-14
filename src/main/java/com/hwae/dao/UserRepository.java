package com.hwae.dao;

import com.hwae.dto.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findByNickName(String name);
    Optional<User> findById(Long id);
    List<User> findAll();
}

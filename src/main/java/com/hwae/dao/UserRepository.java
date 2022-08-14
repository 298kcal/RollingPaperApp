package com.hwae.dao;

import com.hwae.dto.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findUserByNickName(String name);
    List<User> findAll();
}

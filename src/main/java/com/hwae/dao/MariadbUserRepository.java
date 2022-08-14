package com.hwae.dao;

import com.hwae.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MariadbUserRepository extends JpaRepository<User, Long>, UserRepository {
    @Override
    Optional<User> findByNickName(String name);
}

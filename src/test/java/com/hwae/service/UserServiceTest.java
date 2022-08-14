package com.hwae.service;

import com.hwae.dao.MariadbUserRepository;
import com.hwae.dao.UserRepository;
import com.hwae.dto.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional
class UserServiceTest {

    @Autowired UserService userService;
    @Autowired UserRepository userRepository;

    @Test
    void join() {
        // given
        User user = new User();
        user.setNickName("ossu");
        user.setPhoneNo("01011112222");
        user.setPassword("1234");

        // when
        Long saveId = userService.join(user);

        // then
        User findUser = userService.findOne(saveId).get();
        Assertions.assertThat(user.getNickName()).isEqualTo(findUser.getNickName());
    }

    @Test
    void findUsers() {
    }
}

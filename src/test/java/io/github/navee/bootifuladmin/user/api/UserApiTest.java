package io.github.navee.bootifuladmin.user.api;

import io.github.navee.bootifuladmin.user.domain.UserVO;
import io.github.navee.bootifuladmin.user.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

/**
 * @author raozhanghui
 * @date 2021-09-28 17:30
 **/
@SpringBootTest
public class UserApiTest {
    @Autowired
    private UserApi userApi;

    @Test
    public void get() {
        final Optional<UserVO> user = userApi.get(1L);
        System.out.println("user = " + user);
    }
}

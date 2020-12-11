package io.github.navee.bootifuladmin.repository;

import io.github.navee.bootifuladmin.entity.Role;
import io.github.navee.bootifuladmin.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Collections;

/**
 * @author raozhanghui
 * @date 2020-12-11 16:45
 **/
@SpringBootTest
@Slf4j
class UserRepositoryTest {

    @Resource
    private UserRepository userRepository;
    @Resource
    private RoleRepository roleRepository;

    @Test
    public void testCrud() {
        final User user = new User();
        user.setName("饶章辉");
        user.setAge(29);
        userRepository.save(user);
        if (log.isDebugEnabled()) {
            log.debug("user:{}", user);
        }
        Role role = new Role();
        role.setName("管理员");
        roleRepository.save(role);
        if (log.isDebugEnabled()) {
            log.debug("role:{}", role);
        }
        user.setRoles(Collections.singleton(role));
        userRepository.save(user);
        if (log.isDebugEnabled()) {
            log.debug("user:{}", user);
        }
    }
}

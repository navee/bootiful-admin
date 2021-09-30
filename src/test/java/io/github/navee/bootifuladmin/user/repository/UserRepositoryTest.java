package io.github.navee.bootifuladmin.user.repository;

import io.github.navee.bootifuladmin.user.entity.Role;
import io.github.navee.bootifuladmin.user.entity.User;
import io.github.navee.bootifuladmin.user.entity.UserRoleRef;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collections;

/**
 * @author raozhanghui
 * @date 2020-12-11 16:45
 **/
@SpringBootTest
@Slf4j
@Transactional
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
        user.setSex(1);
        userRepository.save(user);
        if (log.isDebugEnabled()) {
            log.debug("user:{}", user);
        }
        Role role = new Role();
        role.setName("管理员");
        final Role role1 = roleRepository.save(role);
        if (log.isDebugEnabled()) {
            log.debug("role:{}", role);
        }
        final UserRoleRef userRoleRef = new UserRoleRef();
        userRoleRef.setRoleId(role1.getId());
        user.setRoles(Collections.singleton(userRoleRef));
        userRepository.save(user);
        if (log.isDebugEnabled()) {
            log.debug("user:{}", user);
        }
    }
}

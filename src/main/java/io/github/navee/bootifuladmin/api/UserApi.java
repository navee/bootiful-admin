package io.github.navee.bootifuladmin.api;

import io.github.navee.bootifuladmin.entity.User;
import io.github.navee.bootifuladmin.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author raozhanghui
 * @date 2020-12-14 15:02
 **/
@RestController
@RequestMapping("user")
public class UserApi {
    @Resource
    private UserRepository userRepository;

    @GetMapping(path = "{id}")
    public Optional<User> get(@PathVariable(name = "id") Long id) {
        return userRepository.findById(id);
    }

}

package cc.navee.bootiful.admin.controller;

import cc.navee.bootiful.admin.dao.UserRepository;
import cc.navee.bootiful.admin.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "list")
    @ResponseBody
    public Iterable<User> list() {
        return userRepository.findAll();
    }
}

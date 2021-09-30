package io.github.navee.bootifuladmin.user.repository;

import io.github.navee.bootifuladmin.user.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author raozhanghui
 * @date 2020-12-11 16:41
 **/
public interface UserRepository extends CrudRepository<User, Long> {

}

package cc.navee.bootiful.admin.dao;

import cc.navee.bootiful.admin.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

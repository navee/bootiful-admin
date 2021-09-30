package io.github.navee.bootifuladmin.user.entity;

import io.github.navee.bootifuladmin.base.IdEntity;
import lombok.Data;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.Set;

/**
 * @author raozhanghui
 * @date 2020-12-11 16:35
 **/
@Data
public class User extends IdEntity {
    private String name;
    private Integer sex;
    private Integer age;
    @MappedCollection(idColumn = "user_id")
    private Set<UserRoleRef> roles;
}

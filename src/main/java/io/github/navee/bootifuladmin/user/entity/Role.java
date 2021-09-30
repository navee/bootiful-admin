package io.github.navee.bootifuladmin.user.entity;

import io.github.navee.bootifuladmin.base.IdEntity;
import lombok.Data;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.Set;

/**
 * @author raozhanghui
 * @date 2020-12-11 17:10
 **/
@Data
public class Role extends IdEntity {
    private String name;
    @MappedCollection(idColumn = "role_id")
    private Set<RolePermissionRef> permissions;
}

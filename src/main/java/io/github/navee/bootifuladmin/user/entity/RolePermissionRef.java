package io.github.navee.bootifuladmin.user.entity;

import io.github.navee.bootifuladmin.base.IdEntity;
import lombok.Data;

/**
 * @author raozhanghui
 * @date 2021-09-28 15:23
 **/
@Data
public class RolePermissionRef extends IdEntity {
    private Long roleId;
    private Long permissionId;
}

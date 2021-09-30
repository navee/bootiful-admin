package io.github.navee.bootifuladmin.user.entity;

import io.github.navee.bootifuladmin.base.IdEntity;
import lombok.Data;

/**
 * @author raozhanghui
 * @date 2021-09-28 15:12
 **/
@Data
public class UserRoleRef extends IdEntity {
    private Long userId;
    private Long roleId;
}

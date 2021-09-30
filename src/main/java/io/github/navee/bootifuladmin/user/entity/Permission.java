package io.github.navee.bootifuladmin.user.entity;

import io.github.navee.bootifuladmin.base.IdEntity;
import lombok.Data;

/**
 * @author raozhanghui
 * @date 2020-12-11 17:49
 **/
@Data
public class Permission extends IdEntity {
    private String name;
    private String code;
    private String uri;
}

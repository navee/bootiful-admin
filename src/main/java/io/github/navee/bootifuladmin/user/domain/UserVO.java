package io.github.navee.bootifuladmin.user.domain;

import io.github.navee.bootifuladmin.base.BaseDomain;
import lombok.Data;

/**
 * @author raozhanghui
 * @date 2021-09-28 17:38
 **/
@Data
public class UserVO extends BaseDomain {
    private String name;
    private Integer sex;
    private Integer age;
}

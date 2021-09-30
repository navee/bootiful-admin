package io.github.navee.bootifuladmin.base;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author raozhanghui
 * @date 2021-09-28 17:39
 **/
@Data
public class BaseDomain {
    private Long id;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}

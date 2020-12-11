package io.github.navee.bootifuladmin.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author raozhanghui
 * @date 2020-12-11 17:49
 **/
@Entity
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Permission extends IdEntity {
    private String name;
    @Column(unique = true)
    private String code;
    @Column(unique = true)
    private String uri;
}

package io.github.navee.bootifuladmin.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * @author raozhanghui
 * @date 2020-12-11 16:36
 **/
@Data
@MappedSuperclass
public class IdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @EqualsAndHashCode.Exclude
    private LocalDateTime createDate;
    @LastModifiedDate
    @EqualsAndHashCode.Exclude
    private LocalDateTime updateDate;
}

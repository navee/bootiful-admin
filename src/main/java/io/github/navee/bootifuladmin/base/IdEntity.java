package io.github.navee.bootifuladmin.base;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

/**
 * @author raozhanghui
 * @date 2020-12-11 16:36
 **/
@Data
public class IdEntity {
    @Id
    private Long id;

    @CreatedDate
    @EqualsAndHashCode.Exclude
    private LocalDateTime createDate = LocalDateTime.now();
    @LastModifiedDate
    @EqualsAndHashCode.Exclude
    private LocalDateTime updateDate;
}

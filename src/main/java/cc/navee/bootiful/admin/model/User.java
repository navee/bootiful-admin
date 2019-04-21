package cc.navee.bootiful.admin.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    private long id;
    private String name;
    private String username;
}

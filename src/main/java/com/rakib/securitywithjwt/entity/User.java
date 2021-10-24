package com.rakib.securitywithjwt.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User extends BaseEntity {
    private String userName;
    private String email;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

}

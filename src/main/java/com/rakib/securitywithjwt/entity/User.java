package com.rakib.securitywithjwt.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class User extends BaseEntity {
    private String userName;
    private String email;
    private String password;

}

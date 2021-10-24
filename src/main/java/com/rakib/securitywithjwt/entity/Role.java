package com.rakib.securitywithjwt.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Role extends BaseEntity {
    private String roleName;
    private String roleDescription;
}

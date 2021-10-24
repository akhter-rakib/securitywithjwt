package com.rakib.securitywithjwt.dto;

import lombok.Data;

@Data
public class RoleDto extends BaseDto {
    private String roleName;
    private String roleDescription;
}


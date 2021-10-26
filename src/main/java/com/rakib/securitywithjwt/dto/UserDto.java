package com.rakib.securitywithjwt.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto extends BaseDto {
    private String userName;
    private String email;
    private String password;
    private List<RoleDto> roles;
}

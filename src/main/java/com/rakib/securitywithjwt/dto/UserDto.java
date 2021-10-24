package com.rakib.securitywithjwt.dto;

import lombok.Data;

@Data
public class UserDto extends BaseDto {
    private String userName;
    private String email;
    private String password;
}

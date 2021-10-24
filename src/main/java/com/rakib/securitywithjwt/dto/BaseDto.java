package com.rakib.securitywithjwt.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BaseDto {
    private Long id;
    private Date createdAt;
    private Date updatedAt;
    private Integer activeStatus;
}

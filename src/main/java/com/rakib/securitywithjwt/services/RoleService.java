package com.rakib.securitywithjwt.services;

import com.rakib.securitywithjwt.dto.Response;
import com.rakib.securitywithjwt.dto.RoleDto;

public interface RoleService {
    Response saveRole(RoleDto roleDto);
}

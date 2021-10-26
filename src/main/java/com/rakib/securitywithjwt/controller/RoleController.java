package com.rakib.securitywithjwt.controller;

import com.rakib.securitywithjwt.annotations.ApiController;
import com.rakib.securitywithjwt.dto.Response;
import com.rakib.securitywithjwt.dto.RoleDto;
import com.rakib.securitywithjwt.services.RoleService;
import com.rakib.securitywithjwt.util.UrlConstraint;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@ApiController
@RequestMapping(UrlConstraint.RoleManagement.ROOT)
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping
    public Response saveRole(@RequestBody RoleDto roleDto) {
        return roleService.saveRole(roleDto);
    }
}

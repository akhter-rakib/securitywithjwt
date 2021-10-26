package com.rakib.securitywithjwt.services.impl;

import com.rakib.securitywithjwt.dto.Response;
import com.rakib.securitywithjwt.dto.RoleDto;
import com.rakib.securitywithjwt.entity.Role;
import com.rakib.securitywithjwt.repository.RoleRepository;
import com.rakib.securitywithjwt.services.RoleService;
import com.rakib.securitywithjwt.util.ResponseBuilder;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;

    public RoleServiceImpl(RoleRepository roleRepository, ModelMapper modelMapper) {
        this.roleRepository = roleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Response saveRole(RoleDto roleDto) {
        Role role = modelMapper.map(roleDto, Role.class);
        role = roleRepository.save(role);
        if (role != null) {
            return ResponseBuilder.getSuccessResponse(HttpStatus.CREATED, "Role has been created", role);
        }
        return ResponseBuilder.getFailureResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error");
    }
}

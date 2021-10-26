package com.rakib.securitywithjwt.services.impl;

import com.rakib.securitywithjwt.dto.Response;
import com.rakib.securitywithjwt.dto.UserDto;
import com.rakib.securitywithjwt.entity.User;
import com.rakib.securitywithjwt.repository.UserRepository;
import com.rakib.securitywithjwt.services.UserService;
import com.rakib.securitywithjwt.util.ResponseBuilder;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    public UserServiceImpl(UserRepository userRepository1, ModelMapper modelMapper) {
        this.userRepository = userRepository1;
        this.modelMapper = modelMapper;
    }

    @Override
    public Response saveUser(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        user = userRepository.save(user);
        if (user != null) {
            return ResponseBuilder.getSuccessResponse(HttpStatus.CREATED, "User has been created", user);
        }
        return ResponseBuilder.getFailureResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error");
    }
}

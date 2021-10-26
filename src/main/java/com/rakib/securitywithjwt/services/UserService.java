package com.rakib.securitywithjwt.services;

import com.rakib.securitywithjwt.dto.Response;
import com.rakib.securitywithjwt.dto.UserDto;

public interface UserService {

    Response saveUser(UserDto userDto);
}

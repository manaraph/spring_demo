package com.springtut.app.ws.service;

import com.springtut.app.ws.shared.dto.UserDto;

public interface UserService {
	UserDto createUser(UserDto user);
}

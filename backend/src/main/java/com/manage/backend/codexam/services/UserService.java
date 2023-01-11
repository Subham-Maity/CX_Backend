package com.manage.backend.codexam.services;

import com.manage.backend.codexam.entities.User;
import com.manage.backend.codexam.payloads.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user , Integer userid);
    UserDto getUserById(Integer userid);

    List<UserDto> getAllUsers();

    void deleteUser(Integer userid);

}

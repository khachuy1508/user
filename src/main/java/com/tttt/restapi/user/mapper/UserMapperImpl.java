package com.tttt.restapi.user.mapper;

import com.tttt.restapi.user.dto.UserDto;
import com.tttt.restapi.user.model.User;

public class UserMapperImpl implements UserMapper {
    @Override

    public UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }
        UserDto userDto = new UserDto();
        userDto.setUserName(user.getUserName());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setPassword(user.getPassword());
        userDto.setDateOfBirth(user.getDateOfBirth());
        userDto.setAddress(user.getAddress());
        userDto.setPhoneNumber(user.getPhoneNumber());
       
        return userDto;
    }

    @Override
    public User userDtoToUser(UserDto userDto) {
        if (userDto == null){
            return null;
        }
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setFirstName(userDto.getFirstName());
        user.setPassword(userDto.getPassword());
        user.setLastName(userDto.getLastName());
        user.setDateOfBirth(userDto.getDateOfBirth());
        user.setAddress(userDto.getAddress());
        user.setPhoneNumber(userDto.getPhoneNumber());
        return user;
    }
}
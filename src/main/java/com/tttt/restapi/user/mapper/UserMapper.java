package com.tttt.restapi.user.mapper;

import com.tttt.restapi.user.dto.UserDto;
import com.tttt.restapi.user.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "Spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Mapping(source = "User", target = "UserDto")
    UserDto userToUserDto(User user);
    
    @Mapping(source = "UserDto", target = "User")
    User userDtoToUser(UserDto userDto);
}
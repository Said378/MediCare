package com.mine.medicare.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mine.medicare.model.dto.UserDto;
import com.mine.medicare.model.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
  
	@Mapping(target = "password", ignore = true)
    UserDto userToUserDto(User user);

    User userDtoToUser(UserDto userDto);
}

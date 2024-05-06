package com.mine.medicare.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.mine.medicare.mapper.UserMapper;
import com.mine.medicare.model.dto.UserDto;
import com.mine.medicare.model.entity.User;
import com.mine.medicare.repository.UserRepository;
import com.mine.medicare.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	private final UserMapper mapper;

	@Override
	public UserDto registerUser(UserDto userDto) {

		User user = mapper.userDtoToUser(userDto);

		User persistedUser = userRepository.save(user);

		UserDto persistedUserDto = mapper.userToUserDto(persistedUser);

		return persistedUserDto;
	}

}

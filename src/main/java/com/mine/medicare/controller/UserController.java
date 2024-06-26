package com.mine.medicare.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mine.medicare.model.dto.UserDto;
import com.mine.medicare.service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@PostMapping
	public ResponseEntity<UserDto> registerUser(@RequestBody @Valid UserDto userDto) {
		UserDto registeredUser  = userService.registerUser(userDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(registeredUser);
	}
}

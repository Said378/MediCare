package com.mine.medicare.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // to exclude null values from object properties
public class UserDto {

	private Long id;

	@NotBlank(message = "username cannot be empty")
	private String username;

	@NotBlank(message = "password cannot be empty")
	private String password;

	@NotBlank(message = "phone cannot be empty")
	@Pattern(regexp = "\\d*", message = "Phone number must be numeric")
	@Size(max = 15, message = "Phone number must be less than or equal to 15 characters")
	private String phone;
}

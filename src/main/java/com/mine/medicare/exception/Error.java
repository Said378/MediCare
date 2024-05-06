package com.mine.medicare.exception;

import java.util.UUID;

import lombok.Data;

@Data
public class Error {

	private UUID errorId;
	private String message;
	private String code;

	public Error(UUID errorId, String message, String code) {

		this.errorId = errorId;
		this.message = message;
		this.code = code;
	}
}

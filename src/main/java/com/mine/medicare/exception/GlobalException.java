package com.mine.medicare.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<List<Error>> validationError(MethodArgumentNotValidException ex) {

		List<Error> errors = new ArrayList<>();
		ex.getBindingResult().getFieldErrors().forEach(fieldError -> {
			UUID errorId = UUID.randomUUID();
			Error error = new Error(errorId, fieldError.getDefaultMessage(), HttpStatus.BAD_REQUEST.toString());
			errors.add(error);
		});

		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<Error> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
		
		UUID errorId = UUID.randomUUID();
		Error error = new Error(errorId, ex.getMostSpecificCause().getMessage(), HttpStatus.CONFLICT.toString());
		return new ResponseEntity<>(error, HttpStatus.CONFLICT);
	}
}

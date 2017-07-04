package com.mitrai.samples.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal server Exception occured")
	@ExceptionHandler(Exception.class)
	public void handleSQLException(HttpServletRequest request, Exception ex) {
		// log exception
	}
}

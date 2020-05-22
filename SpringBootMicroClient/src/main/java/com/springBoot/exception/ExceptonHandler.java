package com.springBoot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptonHandler {
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler(Exception ex) {
		return"error";
	}
}

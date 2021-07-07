package com.vmware.roundone.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.vmware.roundone.entity.ErrorMessage;


@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(value= {Exception.class})
	public ResponseEntity<Object> getAnyException(Exception ex, WebRequest req){
		
		String message = "this is a test";
		
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setDate(new Date());
		errorMessage.setMessage(message);
		
		return new ResponseEntity<>(
				
				errorMessage,
				new HttpHeaders(),
				HttpStatus.INTERNAL_SERVER_ERROR
				
				);
	}

	@ExceptionHandler(value= {CustomException.class})
	public ResponseEntity<Object> getCustomException(CustomException ex, WebRequest req){
		
		String message = ex.getLocalizedMessage();
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setDate(new Date());
		errorMessage.setMessage(message);
		
		return new ResponseEntity<>(
				
				errorMessage,
				new HttpHeaders(),
				HttpStatus.INTERNAL_SERVER_ERROR
				
				);
	}
}

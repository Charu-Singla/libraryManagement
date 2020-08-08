package com.example.LibrarryManagement.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class LibraryExceptionController
{
	@ExceptionHandler({ LibraryCoreException.class,CategoryNotFound.class,DataIntegrityViolationException.class})
	public ResponseEntity<Object> exception(Exception exception)
	{
		if(exception instanceof CategoryNotFound)
		{
			return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.NOT_FOUND);
		}
		else if(exception instanceof DataIntegrityViolationException)
		{
			return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.CONFLICT);
		}
		else {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
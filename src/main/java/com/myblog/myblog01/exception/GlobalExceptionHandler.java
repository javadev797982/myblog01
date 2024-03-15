package com.myblog.myblog01.exception;


import com.myblog.myblog01.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
//responseEntity sends response back to postman

@ControllerAdvice//to handle exception apply this exception
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    //create Dto-ErrorDetails-proper message-date,time,uri
    @ExceptionHandler(ResourseNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleResourseNotFoundException(
            ResourseNotFoundException e,
            WebRequest webRequest
    ){
        ErrorDetails errorDetails=new ErrorDetails(e.getMessage(),new Date(),webRequest .getDescription(true));//object of error details class
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

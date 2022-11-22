package com.huseyineren.exceptionhandler.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

//uygulama içerisinde throw edilen bütün exceptionları yakalayıp kullanıcıya bir http response döner

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<?> customerNotFoundException(CustomerNotFoundException customerNotFoundException) {
        List<String> detail = new ArrayList<>();
        detail.add(customerNotFoundException.getMessage());
        ErrorResponse errorResponse = new ErrorResponse("Customer Not Found", detail);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }//customer bulunamaması durumunda çalışan hata

    @ExceptionHandler(CustomerNotNullException.class)
    public ResponseEntity<?> customerNotNull(CustomerNotNullException customerNotNullException) {
        List<String> detail = new ArrayList<>();
        detail.add(customerNotNullException.getMessage());
        ErrorResponse errorResponse = new ErrorResponse("Customer Not Null", detail);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }//customer'ın boş olamayacağı ile ilgili metod


}

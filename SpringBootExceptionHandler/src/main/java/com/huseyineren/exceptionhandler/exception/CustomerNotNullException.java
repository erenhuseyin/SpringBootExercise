package com.huseyineren.exceptionhandler.exception;


public class CustomerNotNullException extends RuntimeException {
    public CustomerNotNullException(String message){
        super(message);
    }
}




//customer'ın null olmadığı durumlar için yazdığımız sınıf
//customer'ın null olamayacağının mesajını buraya göndereceğiz
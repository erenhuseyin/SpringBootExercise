package com.huseyineren.exceptionhandler.exception;


public class CustomerNotFoundException extends RuntimeException{

    public CustomerNotFoundException(String message){
        super(message);
    }
}




//customer'ın bulunamadığı durumlar için yazdığımız sınıf
//customer'ın bulunamayacağının mesajını buraya göndereceğiz
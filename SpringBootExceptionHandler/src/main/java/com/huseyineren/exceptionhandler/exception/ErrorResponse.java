package com.huseyineren.exceptionhandler.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//error mesajlarını verdiğimiz paket, paketimizde mesaj adı ve liste şekline ayrıntıları yer alıyor
@AllArgsConstructor
@Getter
@Setter
public class ErrorResponse {
    private String message;
    private List<String> details;
}

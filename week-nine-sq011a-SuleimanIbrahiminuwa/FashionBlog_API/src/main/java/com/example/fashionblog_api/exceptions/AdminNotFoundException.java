package com.example.fashionblog_api.exceptions;

public class AdminNotFoundException extends RuntimeException{

    public AdminNotFoundException(String message) {
        super(message);
    }
}

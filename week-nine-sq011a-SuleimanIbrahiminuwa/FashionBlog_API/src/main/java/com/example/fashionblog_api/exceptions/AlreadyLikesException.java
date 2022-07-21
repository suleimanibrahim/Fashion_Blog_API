package com.example.fashionblog_api.exceptions;

public class AlreadyLikesException extends RuntimeException{

    public AlreadyLikesException(String message) {
        super(message);
    }
}

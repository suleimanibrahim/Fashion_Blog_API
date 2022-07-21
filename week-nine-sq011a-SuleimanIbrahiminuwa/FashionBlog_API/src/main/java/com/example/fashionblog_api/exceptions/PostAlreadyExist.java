package com.example.fashionblog_api.exceptions;

public class PostAlreadyExist extends RuntimeException{

    public PostAlreadyExist(String message) {
        super(message);
    }
}

package com.example.fashionblog_api.exceptions;

public class PostNotFoundExceptions extends RuntimeException{
    public PostNotFoundExceptions(String message) {
        super(message);
    }
}

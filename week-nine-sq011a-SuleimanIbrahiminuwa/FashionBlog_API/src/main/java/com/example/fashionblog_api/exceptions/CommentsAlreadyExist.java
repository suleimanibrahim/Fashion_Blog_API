package com.example.fashionblog_api.exceptions;

public class CommentsAlreadyExist extends RuntimeException{
    public CommentsAlreadyExist(String message) {
        super(message);
    }
}

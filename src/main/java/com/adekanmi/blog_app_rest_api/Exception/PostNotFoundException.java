package com.adekanmi.blog_app_rest_api.Exception;

import lombok.Getter;

@Getter
public class PostNotFoundException extends RuntimeException{
    private String message;

    public PostNotFoundException(String message) {
        this.message = message;
    }
}


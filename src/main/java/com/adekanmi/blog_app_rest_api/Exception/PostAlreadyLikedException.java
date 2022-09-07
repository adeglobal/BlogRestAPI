package com.adekanmi.blog_app_rest_api.Exception;

import lombok.Getter;

@Getter
public class PostAlreadyLikedException extends RuntimeException{
    private String message;

    public PostAlreadyLikedException(String message) {
        this.message = message;
    }
}


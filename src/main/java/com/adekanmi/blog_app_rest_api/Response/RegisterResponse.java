package com.adekanmi.blog_app_rest_api.Response;

import com.adekanmi.blog_app_rest_api.Model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class RegisterResponse {
    private String message;
    private LocalDateTime timeStamp;
    private User user;
}

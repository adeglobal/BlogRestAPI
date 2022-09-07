package com.adekanmi.blog_app_rest_api.Response;

import com.adekanmi.blog_app_rest_api.Model.Like;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class LikeResponse {
    private String message;
    private LocalDateTime timeStamp;
    private Like like;
    private int totalLikes;
}


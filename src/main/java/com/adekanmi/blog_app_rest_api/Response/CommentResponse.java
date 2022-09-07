package com.adekanmi.blog_app_rest_api.Response;


import com.adekanmi.blog_app_rest_api.Model.Comment;
import com.adekanmi.blog_app_rest_api.Model.Post;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CommentResponse {
    private String message;
    private LocalDateTime timeStamp;
    private Comment comment;
    private Post post;

}


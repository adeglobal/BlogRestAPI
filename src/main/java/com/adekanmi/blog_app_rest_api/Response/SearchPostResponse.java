package com.adekanmi.blog_app_rest_api.Response;


import com.adekanmi.blog_app_rest_api.Model.Post;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class SearchPostResponse {

    private String message;
    private LocalDateTime timeStamp;
    private List<Post> posts;
}


package com.adekanmi.blog_app_rest_api.Service;


import com.adekanmi.blog_app_rest_api.DTO.*;
import com.adekanmi.blog_app_rest_api.Model.Post;
import com.adekanmi.blog_app_rest_api.Response.*;

public interface UserService {

    RegisterResponse register(UserDto userDto);

    LoginResponse login(LoginDto loginDto);

    CreatePostResponse createPost(PostDto postDto);

    CommentResponse comment(int user_id , int post_id , CommentDto commentDto);

    LikeResponse like(int user_id , int post_id , LikeDto likeDto);

    SearchCommentResponse searchComment(String keyword);


    SearchPostResponse searchPost(String keyword);

    Post findPostById(int id);

    DeleteCommentResponse deleteCommentById( int id);

    DeletePostResponse deletePostById(int id);


}

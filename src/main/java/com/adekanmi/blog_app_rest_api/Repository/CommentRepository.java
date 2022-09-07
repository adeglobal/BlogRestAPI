package com.adekanmi.blog_app_rest_api.Repository;


import com.adekanmi.blog_app_rest_api.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findByCommentContaining(String keyword);
}

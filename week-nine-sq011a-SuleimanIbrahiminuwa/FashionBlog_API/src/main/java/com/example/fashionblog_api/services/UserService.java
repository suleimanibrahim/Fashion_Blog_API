package com.example.fashionblog_api.services;

import com.example.fashionblog_api.dto.CommentsDto;
import com.example.fashionblog_api.dto.LikesDto;
import com.example.fashionblog_api.dto.SignUpDto;
import com.example.fashionblog_api.models.Comments;
import com.example.fashionblog_api.models.Likes;
import com.example.fashionblog_api.models.Post;
import com.example.fashionblog_api.models.User;
import com.example.fashionblog_api.models.postPage.PostPagination;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;

import java.util.List;

public interface UserService {

    String signUp(SignUpDto signUpDto);
    String login(SignUpDto signUpDto);
    String logout();
    String comments(CommentsDto commentsDto);
    String like(LikesDto likesDto);


    Post viewPost(Long id);
    Page<Post> getAllPost(PostPagination postPagination);


}

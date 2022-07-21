package com.example.fashionblog_api.services;

import com.example.fashionblog_api.dto.AdminDto;
import com.example.fashionblog_api.dto.PostDto;
import com.example.fashionblog_api.dto.UpdatePost;
import com.example.fashionblog_api.models.Admin;
import com.example.fashionblog_api.models.Comments;
import com.example.fashionblog_api.models.Likes;
import com.example.fashionblog_api.models.Post;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

public interface AdminService {

    String login(AdminDto adminDto);
    String postProduct(PostDto postDto);
    String deleteProduct(Long id);
    String updateProduct(UpdatePost updatePost, Long id);
    Post viewPost(Long id);
    List<Post> getAllPost();
    List<Comments> getAllComments();

    List<Likes> getAllLikes();
}

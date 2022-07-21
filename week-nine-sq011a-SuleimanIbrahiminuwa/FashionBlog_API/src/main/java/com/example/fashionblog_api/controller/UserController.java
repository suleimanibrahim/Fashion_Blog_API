package com.example.fashionblog_api.controller;

import com.example.fashionblog_api.dto.CommentsDto;
import com.example.fashionblog_api.dto.LikesDto;
import com.example.fashionblog_api.dto.SignUpDto;
import com.example.fashionblog_api.exceptions.UserNotFoundException;
import com.example.fashionblog_api.models.Comments;
import com.example.fashionblog_api.models.Likes;
import com.example.fashionblog_api.models.Post;
import com.example.fashionblog_api.models.User;
import com.example.fashionblog_api.models.postPage.PostPagination;
import com.example.fashionblog_api.services.AdminService;
import com.example.fashionblog_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/signUp")
    public ResponseEntity<?> userSignUp(@RequestBody SignUpDto signUpDto){
        return new ResponseEntity<>(userService.signUp(signUpDto), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> userLogin(@RequestBody SignUpDto signUpDto){
        return new ResponseEntity<>(userService.login(signUpDto), HttpStatus.OK);
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(){
        return new ResponseEntity<>(userService.logout(), HttpStatus.OK);
    }

    @PostMapping("/comments")
    public ResponseEntity<?> comment(@RequestBody CommentsDto commentsDto){
        return new ResponseEntity<>(userService.comments(commentsDto), HttpStatus.OK);
    }

    @PostMapping("/likes")
    public ResponseEntity<?> comment(@RequestBody LikesDto likesDto){
        return new ResponseEntity<>(userService.like(likesDto),HttpStatus.OK);
    }
    @GetMapping("/viewPostPages")
    public ResponseEntity<Page<Post>> getAllPost(PostPagination postPagination) {
        return ResponseEntity.ok(userService.getAllPost(postPagination));
    }


}

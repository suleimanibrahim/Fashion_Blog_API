package com.example.fashionblog_api.controller;

import com.example.fashionblog_api.dto.*;
import com.example.fashionblog_api.models.Admin;
import com.example.fashionblog_api.models.Comments;
import com.example.fashionblog_api.models.Post;
import com.example.fashionblog_api.models.User;
import com.example.fashionblog_api.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;




    @PostMapping("/post")
    public ResponseEntity<?> postProduct(@RequestBody PostDto postDto){
        return new ResponseEntity<>(adminService.postProduct(postDto), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> adminLogin(@RequestBody AdminDto adminDto) {
        return new ResponseEntity<>(adminService.login(adminDto), HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deletePost(@PathVariable("id") Long id){
        return new ResponseEntity<>(adminService.deleteProduct(id),HttpStatus.OK);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> updatePost(@PathVariable("id") Long id, @RequestBody UpdatePost updatePost){
      return new ResponseEntity<>(adminService.updateProduct(updatePost, id),HttpStatus.OK);
    }

    @GetMapping("/getComments")
    public ResponseEntity viewComments(){

        return new ResponseEntity<>(adminService.getAllComments(),HttpStatus.OK);
    }

    @GetMapping("/getLikes")
    public ResponseEntity viewLikes(){
        return new ResponseEntity<>(adminService.getAllLikes(),HttpStatus.OK);
    }
}

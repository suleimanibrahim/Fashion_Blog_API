package com.example.fashionblog_api.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 3, max = 10, message = "Username must be between 3 to 10 characters")
    private String name;
    @NotNull
    @Column(unique = true, nullable = false)
    private String email;

    @Size(min = 11, message = "Phone Number 11 Digits")
    private String phoneNumber;

    private String gender;

    private String address;
    @Size(min = 5, max = 15, message = "Password must be between 5 to 15 characters")
    private String password;

    @OneToMany(targetEntity = Comments.class, mappedBy = "user1")
    List<Comments> commentsList;

    @OneToMany(targetEntity = Likes.class, mappedBy = "user1")
    List<Likes> likesList;





}

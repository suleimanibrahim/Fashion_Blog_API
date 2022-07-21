package com.example.fashionblog_api.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class SignUpDto {

    private String name;

    private String email;

    private String phoneNumber;

    private String gender;

    private String address;

    private String password;
}

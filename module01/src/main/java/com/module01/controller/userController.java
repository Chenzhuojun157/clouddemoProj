package com.module01.controller;

import com.module01.models.UserInfo;
import com.module01.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/user")
@RestController
@RequiredArgsConstructor
public class userController {

    private final UserService userService;

    @GetMapping("page")
    public List<UserInfo> page() {
        return userService.page();
    }

}
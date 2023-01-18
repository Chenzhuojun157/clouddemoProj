package com.module01.service.impl;

import com.module01.mapper.UserMapper;
import com.module01.models.UserInfo;
import com.module01.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserMapper userMapper;

    @Override
    public List<UserInfo>  page() {
        return userMapper.page();
    }
}

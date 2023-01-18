package com.module01.mapper;

import com.module01.models.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserInfo> page();
}

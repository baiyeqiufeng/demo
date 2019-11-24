package com.qiufeng.demoservice.dao;

import com.qiufeng.demoservice.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserDao extends CUDRDao<User> {

}

package com.luakun.service.impl;

import com.luakun.dao.UserMapper;
import com.luakun.pojo.User;
import com.luakun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author AKunLin
 * Date: 2021/1/27  16:50
 * Description: UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAllUser() {
        List<User> userList = userMapper.findAllUser();
        return userList;
    }
}

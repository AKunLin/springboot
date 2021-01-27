package com.luakun.service.impl;

import com.luakun.dao.UserMapper;
import com.luakun.pojo.User;
import com.luakun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<User> findAllUser() {
        //1.获取redis中的数据
        List<User> list = (List<User>) redisTemplate.boundValueOps("key_all").get();
        //2.判断 是否有，如果有则返回，如果没有则从mysql中获取设置到redis中再返回
        if (list != null && list.size() > 0) {
            return list;
        }
        List<User> allUser = userMapper.findAllUser();

        //3 从mysql中获取设置到redis中再返回
        redisTemplate.boundValueOps("key_all").set(allUser);

        return allUser;
    }

}

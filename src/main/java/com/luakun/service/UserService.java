package com.luakun.service;

import com.luakun.pojo.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author AKunLin
 * Date: 2021/1/27  16:48
 * Description: UserService
 */
public interface UserService {
    public List<User> findAllUser();
}

package com.luakun.dao;

import com.luakun.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author AKunLin
 * Date: 2021/1/27  16:39
 * Description: UserMapper
 */
@Repository
public interface UserMapper {
    public List<User> findAllUser();
}

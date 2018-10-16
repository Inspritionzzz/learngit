package com.xiaoyu.toutiao.dao.impl;

import com.xiaoyu.toutiao.dao.UserDAO;
import com.xiaoyu.toutiao.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDAO {
        public int addUser(User user){
        return 1;
    }
}

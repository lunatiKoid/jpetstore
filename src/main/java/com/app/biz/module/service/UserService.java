package com.app.biz.module.service;

import com.app.biz.module.dataobject.UserDO;

/**
 * Created by liang on 4/27/15.
 */
public interface UserService {
    UserDO findUserById(Integer id);
    int insertUser(UserDO userDO);
}
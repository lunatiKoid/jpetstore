package com.app.biz.module.service.impl;

import com.app.biz.module.dao.UserDao;
import com.app.biz.module.dataobject.UserDO;
import com.app.biz.module.factory.ConnectionFactory;
import com.app.biz.module.service.UserService;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by liang on 4/27/15.
 */
public class UserServiceImpl implements UserService {

    private ConnectionFactory connectionFactory;

    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public void init() {
        dao = connectionFactory.getSqlSessionFactory().openSession().getMapper(UserDao.class);
    }

    private UserDao dao;

    public UserDO findUserById(Integer id) {
        return dao.findUserById(id);
    }

    public int insertUser(UserDO userDO) {
        return dao.insertUser(userDO);
    }
}

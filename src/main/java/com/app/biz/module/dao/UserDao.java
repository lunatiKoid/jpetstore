package com.app.biz.module.dao;

import com.app.biz.module.dataobject.UserDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * Created by liang on 4/27/15.
 */
public interface UserDao {

    @Select("SELECT * FROM user WHERE id=#{id}")
    UserDO findUserById(Integer id);

    @Insert("INSERT into user (id,name,age) values (#{id},#{name},#{age})")
    int insertUser(UserDO userDO);
}

package com.greenism.management.dao;

import com.greenism.management.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:UserDao
 * Package:com.greenism.management.dao
 * Description
 *
 * @data:2019/12/22 20:41
 * @author:jiahongjie
 */
@Mapper
public interface UserDao {
    void insertUser(User user);
}

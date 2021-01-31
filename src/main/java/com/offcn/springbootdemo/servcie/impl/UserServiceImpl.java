package com.offcn.springbootdemo.servcie.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.springbootdemo.dao.UserDao;
import com.offcn.springbootdemo.pojo.User;
import com.offcn.springbootdemo.servcie.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
//@Service
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    //查询
    @Override
    public List<User> getUserList() {
        return userDao.getAll();
    }

    //添加新用户
    @Override
    public void createUser(User user) {
        userDao.save(user);
    }
    //根据id查询
    @Override
    public User getUser(Integer id) {
        return userDao.findOne(id);
    }

    //根据id修改
    @Override
    public void updateUser( Integer id,User user) {
        user.setId(id);
        userDao.update(user);
    }

    //删除
    @Override
    public void deleteUser(Integer id) {
        userDao.delete(id);
    }

    @Override
    public void deleteUserAll() {
        userDao.deleteAll();
    }
}

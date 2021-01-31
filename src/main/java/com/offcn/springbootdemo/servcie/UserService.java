package com.offcn.springbootdemo.servcie;

import com.offcn.springbootdemo.pojo.User;

import java.util.List;

//用户数据操作业务接口
public interface UserService {
    //获取全部用户数据
    public List<User> getUserList();
    //新增用户数据
    public void createUser(User user);
    //获取指定id用户信息
    public User getUser(Integer id);
    //更新指定id用户信息
    public void updateUser(Integer id,User user);
    //删除指定id用户
    public void deleteUser(Integer id);
    //删除所有
    public void deleteUserAll();
}

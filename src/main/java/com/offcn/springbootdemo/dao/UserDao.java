package com.offcn.springbootdemo.dao;

import com.offcn.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper //作用:在接口类上添加了@Mapper,在编译之后会生成相应的接口实现类
public interface UserDao {
    @Insert("insert into user(name,age) values(#{name},#{age})")
    public void save(User user);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    public void update(User user);

    @Delete("delete from user where id=#{id}")
    public void delete(Integer id);

    @Delete("delete from user")
    public void deleteAll();

    @Select("select * from user")
    public List<User> getAll();

    @Select("select * from user where id=#{id}")
    public User findOne(Integer id);
}

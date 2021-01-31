package com.offcn.springbootdemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.offcn.springbootdemo.pojo.User;
import com.offcn.springbootdemo.servcie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/user")
public class UserController {

   @Reference(timeout = 3000)
    UserService userService;

    //查询所有
    @GetMapping("/userall")
    public List<User> getUserList() {
       return userService.getUserList();
    }
    //根据id查询
    @GetMapping("getuserbyid")
    public User getUserById(@PathVariable Integer id){
        return userService.getUser(id);
    }
    //添加数据
    @PutMapping("adduser")
    public String addUser(@RequestBody User user){
        userService.createUser(user);
        return "添加成功";
    }
    //删除数据
    @DeleteMapping("deletebyid")
    public String deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return "删除成功";
    }
    //删除所有数据
    @DeleteMapping("deleteuserall")
    public void deleteUserAll(){
        userService.deleteUserAll();
    }
    //修改、更新数据
    @PutMapping("/updateuser")
    public String updateUser(@PathVariable Integer id,@RequestBody User user){
        userService.updateUser(id,user);
        return "修改成功";
    }

}

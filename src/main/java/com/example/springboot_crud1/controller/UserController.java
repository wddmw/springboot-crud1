package com.example.springboot_crud1.controller;

import com.example.springboot_crud1.entity.User;
import com.example.springboot_crud1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seven")
public class UserController {
    @Autowired
    private UserService userService;
    //通过id得到用户信息
    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    public String getUser(@PathVariable int id){
        return userService.getUser(id).toString();
    }
    //通过id删除用户信息
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(int id){
        int result = userService.delete(id);
        if(result >= 1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    //更改用户信息
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(User user){
        int result = userService.update(user);
        if(result >= 1){
            return "更新成功！";
        }else{
            return "更新失败！";
        }
    }
    //插入用户信息
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public int insert(User user){
        return userService.save(user);
    }
    //查询所有用户的信息
    @RequestMapping("/selectAll")
    @ResponseBody //理解为：单独作为响应体，这里不调用实体类的toString方法
    public List<User> listUser(){
        return userService.selectAll();
    }
}

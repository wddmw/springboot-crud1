package com.example.springboot_crud1.mapper;

import com.example.springboot_crud1.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Repository，注解它本身的作用便是标注数据访问组件，作为DAO对象，
 * 它将 DAO 导入 IoC 容器，并使未经检查的异常有资格转换为 Spring DataAccessException。
 * 通过这个注解能够报出更多发现不了的错误，更有利于对项目的维护和开发。
 * 其实@Repository不在接口上进行注明，我们的程序照样可以运行，
 * 因为在我们使用@MapperScan的时候，我们已经将我们的接口交给框架中的代理类，
 * 所以即便是我们不写，程序不会报错，只是我们在Service层写明接口的时候，
 * IDEA会给出红色的波浪线。可以这样理解，标注@Repository是为了告诉编译器我将接口注入到了IoC容器了，你不要报错啦~
 */
@Repository
public interface UserMapper {
    //1.通过id查询用户信息
    User getUser(int id);
    //2.通过id删除用户信息
    int delete(int id);
    //3.更改用户信息
    int update(User user);
    //4.插入用户信息
    int save(User user);
    //5.查询所有用户信息
    List<User> selectAll();
}

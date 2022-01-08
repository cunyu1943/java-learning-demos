package com.cunyu.springbootjpademo.controller;

import com.cunyu.springbootjpademo.entity.User;
import com.cunyu.springbootjpademo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : springboot-jpa-demo
 * @package : com.cunyu.springbootjpademo.controller
 * @className : UserController
 * @createTime : 2022/1/7 10:55
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    /**
     * 新增用户
     *
     * @param user
     */
    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    /**
     * 根据用户 id 删除用户
     *
     * @param id
     */
    @PostMapping("/delete/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }

    /**
     * 更新用户，id 相同则更新，不同则新增
     *
     * @param user
     */
    @PostMapping("/update")
    public void updateUser(@RequestBody User user) {
        userRepository.save(user);
    }

    /**
     * 查询所有用户
     *
     * @return
     */
    @PostMapping("/query")
    public List<User> queryUsers() {
        List<User> userList = userRepository.findAll();
        return userList;
    }
}

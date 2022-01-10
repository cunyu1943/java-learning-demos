package com.cunyu.springbootfreemarkerdemo.controller;

import com.cunyu.springbootfreemarkerdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : zhangliang
 * @version : 1.0
 * @project : java-learning
 * @package : com.cunyu.springbootfreemarkerdemo.controller
 * @className : UserController
 * @createTime : 2021/11/30 22:04
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @description :
 */
@Controller
public class UserController {
    @GetMapping("/index")
    public String index(Model model) {
        User user = new User();
        user.setAge(30);
        user.setEmail("747731461@qq.com");
        user.setName("村雨遥");
        model.addAttribute("user", user);
        return "index";
    }
}

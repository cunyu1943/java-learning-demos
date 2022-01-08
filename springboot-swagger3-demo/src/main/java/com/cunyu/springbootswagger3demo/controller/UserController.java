package com.cunyu.springbootswagger3demo.controller;

import com.cunyu.springbootswagger3demo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : springboot-swagger3-demo
 * @package : com.cunyu.springbootswagger3demo.controller
 * @className : UserController
 * @createTime : 2022/1/6 11:02
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */

@Api(tags = "测试")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation("测试接口")
    @PostMapping("/show")
    public String show(@RequestBody User user) {
        return "hello," + user.getName() + ",welcome to springboot swagger3！";
    }
}

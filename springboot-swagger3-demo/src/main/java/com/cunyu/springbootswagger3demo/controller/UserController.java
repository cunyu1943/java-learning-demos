package com.cunyu.springbootswagger3demo.controller;

import com.cunyu.springbootswagger3demo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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

    @ApiOperation("测试接口1")
    @PostMapping("/show1")
    public String show1(@ApiParam(value = "姓名", required = true, example = "村雨遥") @RequestBody String name) {
        return "hello," + name + ",welcome to springboot swagger3！";
    }

    @ApiOperation("测试接口2")
    @PostMapping("/show2")
    public String show2(@ApiParam(value = "用户对象", required = true) @RequestBody User user) {
        return "hello," + user.getName() + ",welcome to springboot swagger3！";
    }
}

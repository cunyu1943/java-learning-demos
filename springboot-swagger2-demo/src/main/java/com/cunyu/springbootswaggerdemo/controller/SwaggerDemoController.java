package com.cunyu.springbootswaggerdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : springboot-swagger-demo
 * @package : com.cunyu.springbootswaggerdemo.controller
 * @className : SwaggerDemoController
 * @createTime : 2022/1/5 22:21
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */

@Api
@RestController
public class SwaggerDemoController {
    @ApiOperation(value = "hello world 接口")
    @GetMapping("hello")
    public String hello() {
        return "hello world";
    }

    @ApiOperation(value = "有参接口")
    @PostMapping("demo")
    public String demo(@ApiParam(name = "name", value = "村雨遥", required = true) @RequestBody String name) {
        return "hello," + name;
    }
}

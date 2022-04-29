package com.cunyu.springbootknife4jdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created with IntelliJ IDEA.
 *
 * @Package : com.cunyu.springbootknife4jdemo.controller
 * @ClassName : DemoController.java
 * @CreateTime : 2022/4/29 14:36
 * @Version : 1.0
 * @Author : 村雨遥
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io/JavaPark
 * @Description :
 */

@Api(tags = "测试模块")
@RestController
public class DemoController {
    @ApiImplicitParam(name = "name", value = "姓名", required = true)
    @ApiOperation(value = "入门程序，Hello World")
    @PostMapping("/helloWorld")
    public ResponseEntity<String> helloWorld(@RequestParam(value = "name") String name) {
        return ResponseEntity.ok("Hello World, " + name);
    }
}

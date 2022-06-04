package site.cunyu1943.springbootsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : site.cunyu1943.springbootsecuritydemo.controller
 * @ClassName : HelloController.java
 * @CreateTime : 2022/6/4 21:59
 * @Version : 1.0
 * @Author : 村雨遥
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io/JavaPark
 * @Description :
 */
@RestController
public class HelloController {
    @GetMapping(value ="/hello")
    public String hello() {
        return "Hello World！";
    }
}

package com.cunyu.springbootjpademo.repository;

import com.cunyu.springbootjpademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : springboot-jpa-demo
 * @package : com.cunyu.springbootjpademo.repository
 * @className : UserRepository
 * @createTime : 2022/1/7 10:49
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */
@Service
public interface UserRepository extends JpaRepository<User, Integer> {
}

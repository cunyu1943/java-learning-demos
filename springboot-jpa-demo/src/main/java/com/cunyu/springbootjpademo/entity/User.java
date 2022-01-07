package com.cunyu.springbootjpademo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : springboot-jpa-demo
 * @package : com.cunyu.springbootjpademo.entity
 * @className : User
 * @createTime : 2022/1/7 10:19
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "ch_name")
    private String chName;

    public User(String username, String password, String chName) {
        this.username = username;
        this.password = password;
        this.chName = chName;
    }
}

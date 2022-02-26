package com.cunyu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author : 村雨遥
 * @Version : 1.0
 * @Package : com.cunyu.entity
 * @ClassName : User.java
 * @CreateTime : 2022/2/26 18:09
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Integer id;
    private String name;
    private String password;
}

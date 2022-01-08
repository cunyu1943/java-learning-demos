package com.cunyu.springbootswaggerdemo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : springboot-swagger2-demo
 * @package : com.cunyu.springbootswaggerdemo.entity
 * @className : User
 * @createTime : 2022/1/8 18:24
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户实体类")
public class User {
    @ApiModelProperty(value = "姓名", required = true, example = "村雨遥")
    private String name;

    @ApiModelProperty(value = "年龄", required = true, example = "20")
    private Integer age;
}


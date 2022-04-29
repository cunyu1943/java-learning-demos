package com.cunyu.dao.impl;

import com.cunyu.dao.HeroDao;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : com.cunyu.dao.impl
 * @ClassName : HeroDaoImpl.java
 * @CreateTime : 2022/4/29 13:50
 * @Version : 1.0
 * @Author : 村雨遥
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io/JavaPark
 * @Description :
 */
public class HeroDaoImpl implements HeroDao {
    @Override
    public void attack() {
        System.out.println("hero dao attack");
    }
}

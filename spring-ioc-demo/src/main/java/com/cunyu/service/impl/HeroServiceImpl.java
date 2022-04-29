package com.cunyu.service.impl;

import com.cunyu.dao.HeroDao;
import com.cunyu.service.HeroService;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : com.cunyu.service.impl
 * @ClassName : HeroServiceImpl.java
 * @CreateTime : 2022/4/29 13:51
 * @Version : 1.0
 * @Author : 村雨遥
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io/JavaPark
 * @Description :
 */
public class HeroServiceImpl implements HeroService {
    private HeroDao heroDao;

    @Override
    public void attack() {
        System.out.println("hero service attack");
    }

    public void setHeroDao(HeroDao heroDao) {
        this.heroDao = heroDao;
    }
}

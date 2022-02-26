package com.cunyu.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : com.cunyu.util
 * @ClassName : MybatisUtil.java
 * @CreateTime : 2022/2/26 22:06
 * @Version : 1.0
 * @Author : 村雨
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description : MyBatis 工具类
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resourceName = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resourceName);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 22:21 2022/2/26
     * @param
     * @return
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}

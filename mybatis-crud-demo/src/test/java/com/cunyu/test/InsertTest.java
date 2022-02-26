package com.cunyu.test;

import com.cunyu.entity.User;
import com.cunyu.mapper.UserMapper;
import com.cunyu.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : com.cunyu.test
 * @ClassName : InsertTest.java
 * @CreateTime : 2022/2/26 22:03
 * @Version : 1.0
 * @Author : 村雨
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class InsertTest {

    @Test
    public void testInsert() {
// 获取 SqlSession 对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(5, "小雨", "6543210");
        int i = mapper.insert(user);
        System.out.println(i);

        // 提交事务到数据库
        sqlSession.commit();
        System.out.println("添加用户成功");

        // 关闭 SqlSession
        sqlSession.close();
    }
}

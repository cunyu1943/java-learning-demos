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
 * @ClassName : UpdateTest.java
 * @CreateTime : 2022/2/26 22:45
 * @Version : 1.0
 * @Author : 村雨
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class UpdateTest {
    @Test
    public void testUpdate() {
        // 获取 SqlSession 对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.query(1);
        user.setPassword("7891011");
        int i = mapper.update(user);
        System.out.println(user.toString());
        sqlSession.commit();
        System.out.println("更新数据成功");

        // 关闭 SqlSession
        sqlSession.close();
    }
}

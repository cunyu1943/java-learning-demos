package com.cunyu.test;

import com.cunyu.mapper.UserMapper;
import com.cunyu.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : com.cunyu.test
 * @ClassName : DeleteTest.java
 * @CreateTime : 2022/2/26 22:55
 * @Version : 1.0
 * @Author : 村雨
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class DeleteTest {
    @Test
    public void testDelete() {
        // 获取 SqlSession 对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int i = mapper.delete(2);
        sqlSession.commit();
        System.out.println("删除数据成功");

        // 关闭 SqlSession
        sqlSession.close();
    }
}

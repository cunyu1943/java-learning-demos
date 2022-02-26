package com.cunyu.mapper;

import com.cunyu.entity.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨
 * @version : 1.0
 * @Package : com.cunyu.mapper
 * @ClassName : UserMapper.java
 * @createTime : 2022/2/26 18:08
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public interface UserMapper {
    /**
     * @param user
     * @return
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 21:50 2022/2/26
     */
    int insert(User user);

    /**
     * @param
     * @return 对应 id 的用户
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 22:42 2022/2/26
     */
    User query(Integer id);

    /**
     * @param
     * @return
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 22:52 2022/2/26
     */
    int update(User user);

    /**
     * @param id 用户 id
     * @return
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 22:53 2022/2/26
     */
    int delete(Integer id);
}

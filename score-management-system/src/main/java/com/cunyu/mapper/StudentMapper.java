package com.cunyu.mapper;

import com.cunyu.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : com.cunyu.mapper
 * @ClassName : StudentMapper.java
 * @CreateTime : 2022/3/5 16:34
 * @Version : 1.0
 * @Author : 村雨
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Mapper
public interface StudentMapper {
    /**
     * 录入学生成绩
     *
     * @param student 学生对象
     * @return
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 16:38 2022/3/5
     */
    int insertScore(Student student);

    /**
     * 查看所有学生成绩
     *
     * @param
     * @return List<Student> 学生列表
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 16:45 2022/3/5
     */
    public List<Student> showStudentList();

    /**
     * 通过学号查询学生成绩
     *
     * @param id 学号
     * @return
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 16:50 2022/3/5
     */
    public Student queryById(String id);

    /**
     * 修改对应学号学生的成绩
     *
     * @param student 学生
     * @return
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 16:53 2022/3/5
     */
    public int updateById(Student student);


    /**
     * 删除对应学号学生的成绩
     *
     * @param id 学号
     * @return
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 17:02 2022/3/5
     */
    public int deleteById(String id);
}

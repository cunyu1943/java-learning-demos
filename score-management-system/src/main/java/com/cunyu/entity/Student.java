package com.cunyu.entity;

import com.cunyu.mapper.StudentMapper;
import com.cunyu.util.MyBatisUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : com.cunyu.entity
 * @ClassName : Student.java
 * @CreateTime : 2022/3/5 14:38
 * @Version : 1.0
 * @Author : 村雨
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {


    /**
     * 学号
     */
    private String id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 班级
     */
    private String grade;
    /**
     * 高数
     */
    private Double math;
    /**
     * 体育
     */
    private Double sport;
    /**
     * 英语
     */
    private Double english;
    /**
     * Java
     */
    private Double java;
    /**
     * 算法
     */
    private Double algorithm;
    /**
     * 政治
     */
    private Double polity;
    /**
     * C ++
     */
    private Double cPlusPlus;
    /**
     * 总分
     */
    private Double score;
    /**
     * 平均分
     */
    private Double average;

    /**
     * 查询学号是否可用
     *
     * @param id 学号
     * @return true：学号重复，false 学号可用
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 17:30 2022/3/5
     */
    public boolean isValid(String id) {
        SqlSession sqlSession = MyBatisUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.showStudentList();
        for (Student student : students) {
            if (id.equals(student.getId())) {
                return true;
            }
        }
        sqlSession.close();
        return false;
    }


    /**
     * 录入学生成绩
     *
     * @param
     * @return
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 18:05 2022/3/5
     */
    public void insertScore() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------录入学生数据----------");
        System.out.println("请依次输入如下数据：");
        String id;
        while (true) {
            System.out.println("学号");
            id = scanner.nextLine();
            if (isValid(id)) {
                System.out.println("学号重复，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("年级");
        String grade = scanner.nextLine();

        System.out.println("姓名");
        String name = scanner.nextLine();
        System.out.println("数学");
        Double math = scanner.nextDouble();
        System.out.println("英语");
        Double english = scanner.nextDouble();
        System.out.println("体育");
        Double sport = scanner.nextDouble();
        System.out.println("Java");
        Double java = scanner.nextDouble();
        System.out.println("C++");
        Double cPlusPlus = scanner.nextDouble();
        System.out.println("政治");
        Double polity = scanner.nextDouble();
        System.out.println("算法");
        Double algorithm = scanner.nextDouble();

        // 创建对象，并设置属性，并插入数据库
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setGrade(grade);
        student.setSport(sport);
        student.setCPlusPlus(cPlusPlus);
        student.setJava(java);
        student.setMath(math);
        student.setPolity(polity);
        student.setEnglish(english);
        student.setAlgorithm(algorithm);
        student.setScore(math + polity + english + algorithm + cPlusPlus + java + sport);
        student.setAverage(student.getScore() * 1.0 / 7);
        int i = mapper.insertScore(student);
        if (i > 0) {
            sqlSession.commit();
            System.out.println("录入成绩成功");
        } else {
            System.out.println("录入成绩失败，请重新录入");
        }

        sqlSession.close();

    }

    /**
     * 通过学号查询成绩
     *
     * @param
     * @return
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 18:06 2022/3/5
     */
    public void queryScoreById() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------查找学生成绩----------");
        List<Student> students = mapper.showStudentList();
        Student result = new Student();
        Boolean flag = false;
        if (students.size() == 0) {
            System.out.println("当前无数据，请录入成绩后重试");
        } else {
            System.out.println("请输入要查找成绩学生的学号");
            String id = scanner.nextLine();
            for (Student student : students) {
                if (id.equals(student.getId())) {
                    flag = true;
                    result = student;
                }
            }
            if (flag) {
                System.out.println("对应学号的学生成绩如下：");
                System.out.println("学号\t\t班级\t\t姓名\t\t数学\t\t英语\t\t体育\t\tJava\t\tC++\t\t政治\t\t算法\t\t平均分\t\t总分");
                System.out.format("%s\t%s\t\t%s\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", result.getId(), result.getGrade(), result.getName(), result.getMath(), result.getEnglish(), result.getSport(), result.getJava(), result.getCPlusPlus(), result.getPolity(), result.getAlgorithm(), result.getAverage(), result.getScore());
                System.out.println("查找成绩成功！");
            } else {
                System.out.println("未找到对应学号学生的成绩，请确认后重新输入！");
            }
        }
        sqlSession.close();
    }

    /**
     * 查询所有学生成绩
     *
     * @param
     * @return
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 18:26 2022/3/5
     */
    public void queryScores() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.showStudentList();
        if (students.size() == 0) {
            System.out.println("数据库当前无数据，请先添加数据");
        } else {
            System.out.println("----------所有学生成绩如下----------");
            System.out.println("学号\t\t班级\t\t姓名\t\t数学\t\t英语\t\t体育\t\tJava\t\tC++\t\t政治\t\t算法\t\t平均分\t\t总分");
            for (Student student : students) {
                System.out.format("%s\t%s\t%s\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", student.getId(), student.getGrade(), student.getName(), student.getMath(), student.getEnglish(), student.getSport(), student.getJava(), student.getCPlusPlus(), student.getPolity(), student.getAlgorithm(), student.getAverage(), student.getScore());
            }
        }
        sqlSession.close();
    }

    /**
     * 更新对应学号学生的成绩
     *
     * @param
     * @return
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 18:40 2022/3/5
     */
    public void update() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Scanner scanner = new Scanner(System.in);
        List<Student> students = mapper.showStudentList();
        System.out.println("----------修改学生成绩----------");
        if (students.isEmpty()) {
            System.out.println("当前数据库无数据，请添加后重试");
        } else {
            System.out.println("请输入要修改学生的学号");
            String id = scanner.nextLine();
            Student student = mapper.queryById(id);
            if (student == null) {
                System.out.println("未找到对应学号学生信息，请确认后再删除！");
            } else {
                System.out.println("请重新输入该学生的成绩");
                System.out.println("数学");
                Double math = scanner.nextDouble();
                System.out.println("英语");
                Double english = scanner.nextDouble();
                System.out.println("体育");
                Double sport = scanner.nextDouble();
                System.out.println("Java");
                Double java = scanner.nextDouble();
                System.out.println("C++");
                Double cPlusPlus = scanner.nextDouble();
                System.out.println("政治");
                Double polity = scanner.nextDouble();
                System.out.println("算法");
                Double algorithm = scanner.nextDouble();

                student.setSport(sport);
                student.setEnglish(english);
                student.setPolity(polity);
                student.setMath(math);
                student.setJava(java);
                student.setCPlusPlus(cPlusPlus);
                student.setAlgorithm(algorithm);
                student.setScore(sport + math + english + polity + java + cPlusPlus + algorithm);
                student.setAverage(student.getScore() / 7);
                if (mapper.updateById(student) > 0) {
                    sqlSession.commit();
                    System.out.println("----------更新成功----------");
                } else {
                    System.out.println("----------更新失败----------");
                }
            }
        }
        sqlSession.close();
    }

    /**
     * 删除对应学号学生成绩
     *
     * @param
     * @return
     * @Author 村雨遥
     * @Version 1.0
     * @Description
     * @Date 18:38 2022/3/5
     */
    public void delete() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Scanner scanner = new Scanner(System.in);
        List<Student> students = mapper.showStudentList();
        System.out.println("----------删除学生成绩----------");
        if (students.size() == 0) {
            System.out.println("当前数据库无数据，请添加后重试");
        } else {
            System.out.println("输入要删除学生成绩的学号");
            String id = scanner.nextLine();
            if (mapper.queryById(id) == null) {
                System.out.println("未找到对应学号学生信息，请确认后再删除！");
            } else {
                if (mapper.deleteById(id) > 0) {
                    sqlSession.commit();
                    System.out.println("----------删除成功----------");
                } else {
                    System.out.println("----------删除失败----------");
                }
            }
        }
        sqlSession.close();
    }
}

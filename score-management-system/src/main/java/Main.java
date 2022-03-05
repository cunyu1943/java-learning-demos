import com.cunyu.entity.Student;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : PACKAGE_NAME
 * @ClassName : Main.java
 * @CreateTime : 2022/3/5 17:13
 * @Version : 1.0
 * @Author : 村雨
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("----------欢迎使用学生成绩管理系统-----------");
            System.out.println("-------------【1】录入学生成绩-------------");
            System.out.println("-------------【2】查找学生成绩-------------");
            System.out.println("-------------【3】修改学生成绩-------------");
            System.out.println("-------------【4】删除学生成绩-------------");
            System.out.println("-------------【5】显示所有成绩-------------");
            System.out.println("-------------【0】退出管理系统-------------");

            Student student = new Student();

            System.out.println("输入你的选择【0-5】");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    // 录入学生成绩
                    student.insertScore();
                    break;
                case "2":
                    // 查找对应学生成绩
                    student.queryScoreById();
                    break;
                case "3":
                    // 修改学生成绩
                    student.update();
                    break;
                case "4":
                    // 删除学生成绩
                    student.delete();
                    break;
                case "5":
                    // 查询所有学生成绩
                    student.queryScores();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}

import com.cunyu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created with IntelliJ IDEA.
 *
 * @Package : PACKAGE_NAME
 * @ClassName : AppIoC.java
 * @CreateTime : 2022/4/27 09:43
 * @Version : 1.0
 * @Author : 村雨遥
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io/JavaPark
 * @Description :
 */
public class AppIoC {
    public static void main(String[] args) {
        //    加载配置文件，获取 IoC 容器
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //    获取 Bean
        //BookDao bookDao = (BookDao) app.getBean("bookDao");
        //bookDao.save();

        BookService bookService = (BookService) app.getBean("bookService");
        bookService.save();
    }
}

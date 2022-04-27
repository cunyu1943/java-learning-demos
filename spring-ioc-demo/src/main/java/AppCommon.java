import com.cunyu.service.BookService;
import com.cunyu.service.impl.BookServiceImpl;



/**
 * Created with IntelliJ IDEA.
 *
 * @Package : PACKAGE_NAME
 * @ClassName : AppCommon.java
 * @CreateTime : 2022/4/27 09:29
 * @Version : 1.0
 * @Author : 村雨遥
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io/JavaPark
 * @Description :
 */
public class AppCommon {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}

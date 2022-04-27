package com.cunyu.service.impl;

import com.cunyu.dao.BookDao;
import com.cunyu.service.BookService;


/**
 * Created with IntelliJ IDEA.
 *
 * @Package : service.impl
 * @ClassName : BookServiceImpl.java
 * @CreateTime : 2022/4/27 09:30
 * @Version : 1.0
 * @Author : 村雨遥
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io/JavaPark
 * @Description :
 */
public class BookServiceImpl implements BookService {
    //private BookDao bookDao = new BookDaoImpl();

    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save ……");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

}

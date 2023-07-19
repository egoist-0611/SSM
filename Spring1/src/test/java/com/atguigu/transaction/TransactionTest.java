package com.atguigu.transaction;

import com.atguigu.test5.Book;
import com.atguigu.test5.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:transaction-config.xml")
public class TransactionTest {
    @Autowired
    private BookController bookController;
    @Test
    public void test2(){
        bookController.buyBook(1,2);
    }
    @Test
    public void test1(){
        List<Book> books = bookController.getAllBooks();
        System.out.println(books);
    }
}

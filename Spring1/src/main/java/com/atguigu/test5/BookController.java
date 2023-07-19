package com.atguigu.test5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    public void buyBook(Integer uid,Integer bid){
        bookService.buyBook(uid,bid);
    }
}

package com.atguigu.test5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Transactional
    public void buyBook(Integer uid, Integer bid) {
        Integer price = bookDao.getBookPriceById(bid);
        bookDao.updateBookStock(bid);
        bookDao.updateUserBalance(uid, price);
    }
}

package com.atguigu.test5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Book> getAllBooks() {
        String sql = "SELECT * FROM book";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
    }

    public Integer getBookPriceById(Integer bid) {
        String sql = "SELECT price FROM book WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, bid);
    }

    public void updateUserBalance(Integer uid, Integer price) {
        String sql = "UPDATE user SET balance = balance - ? WHERE id = ?";
        jdbcTemplate.update(sql, price, uid);
    }

    public void updateBookStock(Integer bid) {
        String sql = "UPDATE book SET stock = stock - 1 WHERE id = ?";
        jdbcTemplate.update(sql, bid);
    }
}

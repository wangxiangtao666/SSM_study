package com.tao.service;

import com.tao.mapper.BookMapper;
import com.tao.pojo.Book;
import org.springframework.dao.support.DaoSupport;

import java.util.List;



public class BookServiceImpl implements BookService{
    //mapper(dao)层对象注入
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    public int delBookById(int id) {
        return bookMapper.delBookById(id);
    }



    public int updateBookById(Book book) {
        return bookMapper.updateBookById(book);
    }

    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Book> queryAllBook() {
        return bookMapper.queryAllBook();
    }
    public Book queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}

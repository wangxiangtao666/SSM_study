package com.tao.mapper;

import com.tao.pojo.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface BookMapper {
    //添加一本书
    int addBook(Book book);
    //删除一本书
    int delBookById(@Param("bookId") int id);
    //更新一本书
    int updateBookById(Book book);
    //查询一本书
    Book queryBookById(@Param("bookId") int id);
    //查询所有书
    List<Book> queryAllBook();
    //通过名字查询书籍
    Book queryBookByName(@Param("bookName") String bookName);
}

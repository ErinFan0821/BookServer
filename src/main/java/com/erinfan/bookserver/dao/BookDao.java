package com.erinfan.bookserver.dao;

import com.erinfan.bookserver.model.Book;

import java.util.List;

/**
 * Created by techops on 5/11/14.
 */
public interface BookDao {
    public void save(Book book);
    public Book findByBookISBN(int isbn);

    List getAllBooks();
}

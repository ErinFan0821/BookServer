package com.erinfan.bookserver.bo;

import com.erinfan.bookserver.model.Book;

import java.util.List;

/**
 * Created by techops on 5/11/14.
 */
public interface BookBo {
    void save(Book book);
    Book findByISBN(int isbn);
    List<Book> getAllBooks();
}

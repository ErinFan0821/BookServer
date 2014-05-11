package com.erinfan.bookserver.bo.impl;

import com.erinfan.bookserver.bo.BookBo;
import com.erinfan.bookserver.dao.BookDao;
import com.erinfan.bookserver.model.Book;

import java.util.List;

/**
 * Created by techops on 5/11/14.
 */
public class BookBoImpl implements BookBo{
    private List<Book> allBooks;

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    private BookDao bookDao;

    @Override
    public void save(Book book) {
        bookDao.save(book);
    }

    @Override
    public Book findByISBN(int isbn) {
        return bookDao.findByBookISBN(isbn);
    }

    public List getAllBooks() {
        return bookDao.getAllBooks();
    }
}

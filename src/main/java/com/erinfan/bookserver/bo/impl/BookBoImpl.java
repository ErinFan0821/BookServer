package com.erinfan.bookserver.bo.impl;

import com.erinfan.bookserver.bo.BookBo;
import com.erinfan.bookserver.dao.BookDao;
import com.erinfan.bookserver.model.Book;

/**
 * Created by techops on 5/11/14.
 */
public class BookBoImpl implements BookBo{
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
}

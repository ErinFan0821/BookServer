package com.erinfan.bookserver.dao.impl;

import com.erinfan.bookserver.dao.BookDao;
import com.erinfan.bookserver.model.Book;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by techops on 5/11/14.
 */

public class BookDaoImpl extends HibernateDaoSupport implements BookDao {
    @Override
    public void save(Book book) {
        getHibernateTemplate().save(book);
    }

    @Override
    public Book findByBookISBN(int isbn) {
        List list = getHibernateTemplate().find(
                "from Book where isbn=?", isbn);
        return (Book) list.get(0);
    }

    @Override
    public List getAllBooks() {
        return getHibernateTemplate().find(
                "from Book");
    }
}

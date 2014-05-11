package com.erinfan.bookserver.dao.impl;

import com.erinfan.bookserver.dao.BookDao;
import com.erinfan.bookserver.model.Book;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by techops on 5/11/14.
 */
public class BookDaoImpl extends HibernateDaoSupport implements BookDao {
    @Override
    public void save(Book book) {
        getHibernateTemplate().save(book);
    }
}

package com.erinfan.bookserver.common;

import com.erinfan.bookserver.bo.BookBo;
import com.erinfan.bookserver.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by techops on 5/11/14.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

        BookBo bookBo = (BookBo) applicationContext.getBean("bookBo");

        Book book = new Book();
        book.setIsbn(11);
        book.setName("FuckingSpring");
        book.setPrice(9.9);
        book.setAuthor("ErinFan");

        bookBo.save(book);

        System.out.println("Done");
    }
}

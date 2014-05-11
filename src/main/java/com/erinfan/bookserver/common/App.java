package com.erinfan.bookserver.common;

import com.erinfan.bookserver.bo.BookBo;
import com.erinfan.bookserver.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by techops on 5/11/14.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

        BookBo bookBo = (BookBo) applicationContext.getBean("bookBo");

        Book book = new Book();
        book.setIsbn(14);
        book.setName("FuckingSpring");
        book.setPrice(9.9);
        book.setAuthor("ErinFan");

        bookBo.save(book);
        Book byISBN = bookBo.findByISBN(1);
        System.out.println(byISBN.getName());
        List<Book> books = bookBo.getAllBooks();
        for (Book book1 : books) {
            System.out.println(book1.getName());
            System.out.println(book1.getAuthor());
            System.out.println(book1.getIsbn());
            System.out.println(book1.getPrice());
        }

        System.out.println("Done");
    }
}

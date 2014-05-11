package com.erinfan.bookserver.congtroller;

import com.erinfan.bookserver.bo.BookBo;
import com.erinfan.bookserver.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by techops on 5/11/14.
 */
@Controller
@RequestMapping("/welcome")
public class BookController{

    @Autowired
    private BookBo bookBo;

    @RequestMapping(method = RequestMethod.GET)
    public String viewBookInfo(ModelMap model) {
        List<Book> books = bookBo.getAllBooks();
        model.addAttribute("books", books);
        return "index";
    }

    public void setBookBo(BookBo bookBo) {
        this.bookBo = bookBo;
    }
}

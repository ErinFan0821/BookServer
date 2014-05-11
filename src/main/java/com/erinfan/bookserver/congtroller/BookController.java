package com.erinfan.bookserver.congtroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by techops on 5/11/14.
 */
@Controller
@RequestMapping("/welcome")
public class BookController{
    @RequestMapping(method = RequestMethod.GET)
    public String fuckSpring(ModelMap model) {
        model.addAttribute("msg", "fuck spring");
        return "index";
    }
}

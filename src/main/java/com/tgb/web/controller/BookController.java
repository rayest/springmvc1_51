package com.tgb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
@Controller
public class BookController {
    //默认的访问路径后面添加/book：http://localhost:8080/book
    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String index(Map<String, String> model){
        model.put("book_name","Java");
        model.put("book_type","16");
        model.put("book_author","Jim");
        return "book";
    }
}

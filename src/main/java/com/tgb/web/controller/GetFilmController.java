package com.tgb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
@Controller
public class GetFilmController {
    // URL参数传递，访问路径为http://localhost:8080/result?name=某某&age=多大
    @RequestMapping(value = "/filmGet", method = RequestMethod.GET)
    public String result(ModelMap modelMap, @RequestParam String name, @RequestParam int year){
        modelMap.addAttribute("name", name);
        modelMap.addAttribute("year", year);
        return "filmGet";
    }
}

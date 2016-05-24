package com.tgb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
@Controller
public class FilmController {
    @RequestMapping(value = "/film", method = RequestMethod.GET)
    public String addUser(ModelMap modelMap){
        return "film";
    }
}

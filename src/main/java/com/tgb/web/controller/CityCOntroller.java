package com.tgb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
@Controller
public class CityController {
    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response){
        return new ModelAndView("city");
    }
}

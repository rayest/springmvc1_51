package com.tgb.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
/*
@Controller
public class HelloWorldController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, String> model){
        System.out.println("I am working");
        model.put("name","ray");
        model.put("age","24");
        model.put("sex","male");
        return "welcome";
    }
}
*/
@Controller
public class HelloWorldController {
    @RequestMapping
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        Map information = new HashMap();
        information.put("name", "ray");
        information.put("age","24");
        information.put("sex","male");
        return new ModelAndView("welcome", "map", information);
    }
}



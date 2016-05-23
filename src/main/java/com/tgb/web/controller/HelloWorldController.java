package com.tgb.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
@Controller
public class HelloWorldController {
    //默认的访问路径
    @RequestMapping
    public ModelAndView handleRequest1(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map information = new HashMap();
    information.put("name", "ray");
    information.put("age","24");
    information.put("sex","male");
    return new ModelAndView("name2", "map", information);
    }

    //默认的访问路径后面添加/person：http://localhost:8080/person
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String index(Map<String, String> model){
        System.out.println("I am working");
        model.put("name","Lee");
        model.put("age","24");
        model.put("sex","male");
        return "name1";
    }

    //路径参数, 用户视图呈现随访问路径的变化而变化：name和age的值
    //http://localhost:8080/name=某某/age=多大
    @RequestMapping(value = "/info/{name}/{age}", method = RequestMethod.GET)
    public String getName(ModelMap map, @PathVariable("name") String name, @PathVariable("age") int age){
        map.addAttribute("name", name);
        map.addAttribute("age", age);
        return "name";
    }

    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response){
        return new ModelAndView("city");
    }

    // URL参数传递，访问路径为http://localhost:8080/result?name=某某&age=多大
    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String result(ModelMap modelMap, @RequestParam String name, @RequestParam int age){
        modelMap.addAttribute("name", name);
        modelMap.addAttribute("age", age);
        return "result";
    }

    /*纯html表单
    @RequestMapping(value = "/adduser", method = RequestMethod.GET)
    public String addUser(ModelMap modelMap){
        return "add_User";
    }
    */
    @RequestMapping(value = "/adduser", method = RequestMethod.GET)
    public String addUser(ModelMap modelMap){
        User user = new User();
        user.setName("Rayest");
        modelMap.addAttribute("user", user);
        return "add_User";
    }
}



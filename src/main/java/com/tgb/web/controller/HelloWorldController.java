package com.tgb.web.controller;

import com.tgb.web.entity.Dog;
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
    Map playerMap = new HashMap();
    playerMap.put("player_name", "Richard");
    playerMap.put("player_age","24");
    playerMap.put("player_sex","male");
    return new ModelAndView("player", "map", playerMap);
    }

    //默认的访问路径后面添加/book：http://localhost:8080/book
    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String index(Map<String, String> model){
        model.put("book_name","Java");
        model.put("book_type","16");
        model.put("book_author","Jim");
        return "book";
    }
    @RequestMapping(value = "/add_dog", method = RequestMethod.GET)
    public String addUser(ModelMap modelMap){
        Dog dog = new Dog();
        dog.setDog_name("Ruddy");
        modelMap.addAttribute("dog", dog);
        return "add_dog";
    }
    /*纯html表单
   @RequestMapping(value = "/adduser", method = RequestMethod.GET)
   public String addUser(ModelMap modelMap){
       return "add_User";
   }
   */

    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response){
        return new ModelAndView("city");
    }

    //路径参数, 用户视图呈现随访问路径的变化而变化：name和age的值
    //http://localhost:8080/info/name/age
    @RequestMapping(value = "/info/{name}/{age}", method = RequestMethod.GET)
    public String getName(ModelMap map, @PathVariable("name") String name, @PathVariable("age") int age){
        map.addAttribute("name", name);
        map.addAttribute("age", age);
        return "name";
    }

    // URL参数传递，访问路径为http://localhost:8080/result?name=某某&age=多大
    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String result(ModelMap modelMap, @RequestParam String name, @RequestParam int age){
        modelMap.addAttribute("name", name);
        modelMap.addAttribute("age", age);
        return "result";
    }
}

package com.tgb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
@Controller
public class InformationController {
    //路径参数, 用户视图呈现随访问路径的变化而变化：name和age的值
    //http://localhost:8080/info/name/age
    @RequestMapping(value = "/info/{name}/{age}", method = RequestMethod.GET)
    public String getName(ModelMap map, @PathVariable("name") String name, @PathVariable("age") int age){
        map.addAttribute("name", name);
        map.addAttribute("age", age);
        return "information";
    }
}

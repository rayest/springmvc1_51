package com.tgb.web.controller;

import com.tgb.web.entity.Ray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
@Controller
public class AboutRay {
    @RequestMapping(value = "/ray", method = RequestMethod.GET)
    public String knowRay(ModelMap modelMap){
        Ray ray = new Ray();
        modelMap.addAttribute("ray", ray);
        return "ray";
    }
}

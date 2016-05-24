package com.tgb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
@Controller
public class PlayerController {
    @RequestMapping
    public ModelAndView handleRequest1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map playerMap = new HashMap();
        playerMap.put("player_name", "Richard");
        playerMap.put("player_age","24");
        playerMap.put("player_sex","male");
        return new ModelAndView("player", "map", playerMap);
    }
}

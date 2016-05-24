package com.tgb.web.controller;
import com.tgb.web.entity.Music;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
@Controller
public class MusicController {
    @RequestMapping(value = "/music", method = RequestMethod.GET)
    public String addUser(ModelMap modelMap){
        Music music = new Music();
        music.setName("Where'd you go");
        modelMap.addAttribute("music", music);
        return "music";
    }
}

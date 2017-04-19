package com.vvsvip.shop.core.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by blues on 2017/4/19.
 */
@Controller
public class TestAction {

    @RequestMapping("/toFreemarker")
    public ModelAndView toFreemarker() {
        ModelAndView modelAndView = new ModelAndView("test.ftl");
        modelAndView.addObject("title", "Spring MVC And Freemarker");
        modelAndView.addObject("content", " Hello world ， test my first spring mvc ! ");
        return modelAndView;
    }
}

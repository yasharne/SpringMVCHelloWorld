package ir.yasharne.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yashar on 9/17/16.
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public String Hello(ModelMap model){
        model.addAttribute("greeting", "Welcome to first Spring MVC webapp!");
        return "welcome";
    }
}

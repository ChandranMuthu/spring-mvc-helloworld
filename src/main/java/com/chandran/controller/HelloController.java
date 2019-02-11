package com.chandran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello(ModelMap model){
        model.addAttribute("message","Hello! From Chandran");
        
        //This string here should match the name of the jsp file.
        return "hello";
    }
}

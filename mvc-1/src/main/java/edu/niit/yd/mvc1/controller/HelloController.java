package edu.niit.yd.mvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ABC
 * @date 2020/3/24 8:50
 */
@Controller
@RequestMapping("/")
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("info", "hello,spring boot");
        return "hello";
    }
}

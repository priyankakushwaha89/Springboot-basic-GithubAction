package com.example.springboot_basic_GithubAction.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/test")
    public String test()
    {
        return "Hello! This is for Basic Github Action";
    }
    @RequestMapping("/name")
    public String byName(@PathVariable String name)
    {
        return "Hello from"+name;
    }
    @RequestMapping("/name/age")
    public String byNameAge(@PathVariable String name,@PathVariable int age)
    {
        return "Hello! This is "+name+"and i am "+age+"years old";
    }
}

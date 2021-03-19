package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping ("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String hellomvc(@RequestParam("name") String data, Model model){
        model.addAttribute("param_name", data);
        return "hello-template";
    }

    @GetMapping("hello-api")
    @ResponseBody
    public hello helloapi(@RequestParam("name") String data){
        hello dummy = new hello();
        dummy.setName(data);
        return dummy;
    }
    static class hello{
        private String name;
        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

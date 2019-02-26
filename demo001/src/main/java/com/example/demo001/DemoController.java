package com.example.demo001;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return  "demoIndex";
    }
}

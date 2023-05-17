package com.study.NGM301.view;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    public String test() {
        return "index.html";
    }

}

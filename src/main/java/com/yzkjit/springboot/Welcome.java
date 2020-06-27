package com.yzkjit.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public  String index() {
     return "显示列表";
    }
}

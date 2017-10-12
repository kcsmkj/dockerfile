package com.kcsm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kcsm on 2017/10/12.
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello dockerfile";
    }
}

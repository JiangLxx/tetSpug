package com.zy.test.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author JiangLan
 * @since 2023/3/24 16:46
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/req")
    public String enable (){
        return "request success!!!";
    }

}

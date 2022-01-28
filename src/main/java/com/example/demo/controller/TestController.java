package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
//  @RequestMapping("/hello1")
  @GetMapping("/TEST1231222")
  public String helloWord(){
    return "jfkdlas112111111112";
  }
}

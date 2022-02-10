package com.example.demo.controller;

import com.example.demo.domain.Test;
import com.example.demo.service.TestService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

  @Autowired
  private TestService testService;

//  @RequestMapping("/hello1")
  @GetMapping("/TEST1231222")
  public String helloWord(){
    return "jfkdlas112111111112";
  }


  @GetMapping("/test/list")
  public List<Test> list(){
    return testService.list();
  }
}

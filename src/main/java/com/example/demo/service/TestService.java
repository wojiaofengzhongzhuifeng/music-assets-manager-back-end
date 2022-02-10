package com.example.demo.service;

import com.example.demo.domain.Test;
import com.example.demo.mapper.TestMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestService {


  @Autowired
  private TestMapper testMapper;

  public List<Test> list(){
    return testMapper.list();
  }
}

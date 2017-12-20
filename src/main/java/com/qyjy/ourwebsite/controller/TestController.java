package com.qyjy.ourwebsite.controller;

import com.qyjy.ourwebsite.model.Info;
import com.qyjy.ourwebsite.model.ResultBean;
import com.qyjy.ourwebsite.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("test")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("get")
    public ResultBean<Info> testInfo(@RequestParam String title) {
        return testService.getInfoByTitle(title);
    }
}

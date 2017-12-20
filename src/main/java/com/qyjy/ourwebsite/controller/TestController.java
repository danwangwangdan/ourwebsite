package com.qyjy.ourwebsite.controller;

import com.qyjy.ourwebsite.model.Info;
import com.qyjy.ourwebsite.model.ResultBean;
import com.qyjy.ourwebsite.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/get")
    @ResponseBody
    public ResultBean<Info> testInfo(@RequestParam String title) {
        return testService.getInfoByTitle(title);

    }

    @RequestMapping("/qwer")
    @ResponseBody
    public ResultBean<Info> test() {
        ResultBean resultBean = new ResultBean();
        resultBean.setStatusCode(ResultBean.SUCCESS);
        resultBean.setMsg("success");
        return resultBean;
    }

}

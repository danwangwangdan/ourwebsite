package com.qyjy.ourwebsite.service.impl;

import com.qyjy.ourwebsite.model.Info;
import com.qyjy.ourwebsite.model.ResultBean;
import com.qyjy.ourwebsite.service.TestService;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService{

    public ResultBean<Info> getInfoByTitle(String title) {
        return null;
    }
}

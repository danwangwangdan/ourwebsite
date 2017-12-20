package com.qyjy.ourwebsite.service.impl;

import com.qyjy.ourwebsite.model.Info;
import com.qyjy.ourwebsite.model.ResultBean;
import com.qyjy.ourwebsite.service.TestService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ourwebsite.xml")
public class TestServiceImplTest {

    @Autowired
    TestService testService;
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getInfoByTitle() {
        //testService.getInfoByTitle("")
    }

    @Test
    public void insertInfo() {
        Info info = new Info();
        info.setContent("content");
        info.setTitle("title");
        ResultBean resultBean = testService.insertInfo(info);
        log.info(resultBean.toString());
    }
}
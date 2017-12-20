package com.qyjy.ourwebsite.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.qyjy.ourwebsite.dao.InfoDAO;
import com.qyjy.ourwebsite.model.Info;
import com.qyjy.ourwebsite.model.ResultBean;
import com.qyjy.ourwebsite.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService{

    @Autowired
    InfoDAO infoDAO;

    public ResultBean<Info> getInfoByTitle(String title) {

        ResultBean<Info> resultBean = new ResultBean<>();
        try {
            if (StringUtils.isBlank(title)) {
                title = "our";
            }
            Info info = infoDAO.findByTitle(title);
            resultBean.setStatusCode(ResultBean.SUCCESS);
            resultBean.setMsg("success");
            resultBean.setData(info);
        } catch (Exception e) {
            e.printStackTrace();
            resultBean.setMsg("数据库错误");
        }
        return resultBean;
    }

    public ResultBean insertInfo(Info info) {

        ResultBean<Info> resultBean = new ResultBean<>();
        try {
            Info result = infoDAO.save(info);
            resultBean.setStatusCode(ResultBean.SUCCESS);
            resultBean.setMsg("success");
            resultBean.setData(result);
        } catch (Exception e) {
            e.printStackTrace();
            resultBean.setMsg("数据库错误");
        }
        return resultBean;
    }
}

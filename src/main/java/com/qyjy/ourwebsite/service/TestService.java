package com.qyjy.ourwebsite.service;

import com.qyjy.ourwebsite.model.Info;
import com.qyjy.ourwebsite.model.ResultBean;

public interface TestService {
    public ResultBean<Info> getInfoByTitle(String title);

    public ResultBean insertInfo(Info info);
}

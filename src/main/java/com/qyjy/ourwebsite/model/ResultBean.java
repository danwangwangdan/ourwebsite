package com.qyjy.ourwebsite.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;

public class ResultBean<T> extends BaseBody {

    private static final long serialVersionUID = 4571920660225041865L;

    /**
     * 操作成功
     */
    public static final int SUCCESS = 1;

    /**
     * 操作失败
     */
    public static final int FAIL = -1;

    /**
     * 没有权限
     */
    public static final int NO_PERMISSION = 0;


    /**
     * 返回的消息，默认为success
     */
    private String msg = "failed";

    /**
     * 返回的状态码，默认为成功
     */
    private int statusCode = FAIL;

    /**
     * 返回的数据
     */
    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSON.toJSONStringWithDateFormat(this, JSON.DEFFAULT_DATE_FORMAT,
                SerializerFeature.WriteDateUseDateFormat);
    }
}


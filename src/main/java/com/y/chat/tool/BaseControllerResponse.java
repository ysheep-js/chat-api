package com.y.chat.tool;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: controller层返回基类
 * @Author: dh
 * @Date: 2021/4/18 17:27
 */
@Data
public class BaseControllerResponse implements Serializable {

    private Object data;
    private int code;
    private String message;

    public BaseControllerResponse renderSuccess() {
        return renderSuccess("Api调用成功", 1, null);
    }

    public BaseControllerResponse renderSuccess(String msg) {
        return renderSuccess(msg, 1, null);
    }

    public BaseControllerResponse renderSuccess(String msg, int status) {
        return renderSuccess(msg, status, null);
    }

    public BaseControllerResponse renderSuccess(String msg, int status, Object obj) {
        setMessage(msg);
        setCode(status);
        setData(obj);
        return this;
    }

    public BaseControllerResponse renderError() {
        return renderSuccess("Api调用失败", 0, null);
    }

    public BaseControllerResponse renderError(String msg) {
        return renderSuccess(msg, 0, null);
    }

    public BaseControllerResponse renderError(String msg, int status) {
        return renderSuccess(msg, status, null);
    }

    public BaseControllerResponse renderError(String msg, int status, Object obj) {
        setMessage(msg);
        setCode(status);
        setData(obj);
        return this;
    }

}

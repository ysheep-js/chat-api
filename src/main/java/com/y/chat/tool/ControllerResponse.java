package com.y.chat.tool;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: controller层返回基类
 * @Author: dh
 * @Date: 2021/4/18 17:27
 */
/**
 * @Description: 返回结果统一封装
 * @Author: dh
 * @Date: 2021/5/27 19:09
 */
public class ControllerResponse<T> implements Serializable {
    private static final long serialVersionUID = 3436477890959388499L;

    private T data;
    private int code;
    private String message;

    /**
     * @return 返回不带数据的封装类
     */
    public ControllerResponse<T> renderSuccess() {
        return renderSuccess(ControllerResponseEnum.SUCCESS.msg(), ControllerResponseEnum.SUCCESS.code(), null);
    }

    /**
     * @return 返回带成功信息的封装类
     */
    public ControllerResponse<T> renderSuccess(String msg) {
        return renderSuccess(msg, ControllerResponseEnum.SUCCESS.code(), null);
    }

    /**
     * @return 返回带成功状态的封装类
     */
    public ControllerResponse<T> renderSuccess(int status) {
        return renderSuccess(ControllerResponseEnum.SUCCESS.msg(), status, null);
    }

    /**
     * @return 返回带数据的封装类
     */
    public ControllerResponse<T> renderSuccess(T obj) {
        return renderSuccess(ControllerResponseEnum.SUCCESS.msg(), ControllerResponseEnum.SUCCESS.code(), obj);
    }

    /**
     * @return 返回带成功信息，带成功状态，带数据的封装类
     */
    public ControllerResponse<T> renderSuccess(String msg, int status, T obj) {
        this.message = msg;
        this.code = status;
        this.data = obj;
        return this;
    }

    /**
     * @return 返回不带数据的封装类
     */
    public ControllerResponse<T> renderError() {
        return renderSuccess(ControllerResponseEnum.FAIL.msg(), ControllerResponseEnum.FAIL.code(), null);
    }

    /**
     * @return 返回带失败信息的封装类
     */
    public ControllerResponse<T> renderError(String msg) {
        return renderSuccess(msg, ControllerResponseEnum.FAIL.code(), null);
    }

    /**
     * @return 返回带失败状态的封装类
     */
    public ControllerResponse<T> renderError(int status) {
        return renderSuccess(ControllerResponseEnum.FAIL.msg(), status, null);
    }

    /**
     * @return 返回带数据的封装类
     */
    public ControllerResponse<T> renderError(T obj) {
        return renderError(ControllerResponseEnum.FAIL.msg(), ControllerResponseEnum.FAIL.code(), obj);
    }

    /**
     * @return 返回带成功信息，带失败状态，带数据的封装类
     */
    public ControllerResponse<T> renderError(String msg, int status, T obj) {
        this.message = msg;
        this.code = status;
        this.data = obj;
        return this;
    }
}

package com.y.chat.tool;

/**
 * @Description: 返回结果编码与含义
 * @Author: dh
 * @Date: 2021/5/27 19:17
 */
public enum ControllerResponseEnum {
    /**
     * 调用成功
     */
    SUCCESS(1, "Api调用成功"),

    /**
     * 调用失败
     */
    FAIL(-1, "Api调用失败");


    /**
     * 返回编码
     */
    private final Integer code;

    /**
     * 编码对应的消息
     */
    private final String msg;

    ControllerResponseEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 获取枚举类型的编码值
     */
    public Integer code() {
        return this.code;
    }

    /**
     * 获取枚举类型的编码含义
     */
    public String msg() {
        return this.msg;
    }

    /**
     * 根据枚举名称--获取枚举编码
     */
    public static Integer getCode(String name) {
        for (ControllerResponseEnum resultCode : ControllerResponseEnum.values()) {
            if (resultCode.name().equals(name)) {
                return resultCode.code;
            }
        }
        return null;
    }
}

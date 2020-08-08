package com.myproject.aop.entity;

import com.google.gson.Gson;

public class GlobalResponseBody {
    /**
     * 响应代码
     */
    private String status;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应结果
     */
    private Object data;

    public GlobalResponseBody() {
    }

    public GlobalResponseBody(IBaseErrorInfo errorInfo) {
        this.status = errorInfo.getResultCode();
        this.message = errorInfo.getResultMsg();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 成功
     *
     * @return
     */
    public static GlobalResponseBody success() {
        return success(null);
    }

    /**
     * 成功
     * @param data
     * @return
     */
    public static GlobalResponseBody success(Object data) {
        GlobalResponseBody rb = new GlobalResponseBody();
        rb.setStatus(CommonEnum.SUCCESS.getResultCode());
        rb.setMessage(CommonEnum.SUCCESS.getResultMsg());
        rb.setData(data);
        return rb;
    }





    /**
     * 失败
     */
    public static GlobalResponseBody error(IBaseErrorInfo errorInfo) {
        GlobalResponseBody rb = new GlobalResponseBody();
        rb.setStatus(errorInfo.getResultCode());
        rb.setMessage(errorInfo.getResultMsg());
        rb.setData(null);
        return rb;
    }

    /**
     * 失败
     */
    public static GlobalResponseBody error(String code, String message) {
        GlobalResponseBody rb = new GlobalResponseBody();
        rb.setStatus(code);
        rb.setMessage(message);
        rb.setData(null);
        return rb;
    }

    /**
     * 失败
     */
    public static GlobalResponseBody error(String message) {
        GlobalResponseBody rb = new GlobalResponseBody();
        rb.setStatus("-1");
        rb.setMessage(message);
        rb.setData(null);
        return rb;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}

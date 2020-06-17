package com.marshal.epoch.core.rest;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 标准返回结果
 *
 * @author Marshal
 * @date 2019/8/27
 */
public class ResponseEntity<T> {

    /**
     * 本次请求是否成功
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean success = true;

    /**
     * 返回数据
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    /**
     * 状态码-默认200为正常
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer code;

    /**
     * 提示消息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    public ResponseEntity() {
    }

    public ResponseEntity(String message) {
        this.message = message;
    }

    public ResponseEntity(T data) {
        this.data = data;
    }

    public ResponseEntity(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ResponseEntity(Integer code, Boolean success, String message) {
        this.code = code;
        this.success = success;
        this.message = message;
    }

    public ResponseEntity(Boolean success, T data, Integer code, String message) {
        this.success = success;
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
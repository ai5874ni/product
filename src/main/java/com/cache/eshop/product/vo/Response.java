package com.cache.eshop.product.vo;

/**
 * @program: eshop
 * @description: 返回的响应
 * @author: Mr.Wang
 * @create: 2018-08-04 18:14
 */
public class Response {
    public static final String SUCCESS = "success";
    public static final String FAILURE = "failure";

    private String status;
    private String message;

    public Response() {

    }

    public Response(String status) {
        this.status = status;
    }

    public Response(String status, String message) {
        this.status = status;
        this.message = message;
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

}

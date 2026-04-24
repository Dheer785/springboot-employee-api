package com.api_nov.dto;

public class APIResponse<T> {

    private String message;

    public int status;
    private T data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    public APIResponse(String message, int status, T data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }
}









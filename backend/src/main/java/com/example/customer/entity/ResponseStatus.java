package com.example.customer.entity;

//Map을 대신해서 객체로 만들어서 사용

public class ResponseStatus {
    private Integer statusCode;
    private String statusMsg;

    public ResponseStatus() {
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }


    @Override
    public String toString() {
        return "ResponseStatus{" +
                "statusCode=" + statusCode +
                ", statusMsg='" + statusMsg + '\'' +
                '}';
    }
}

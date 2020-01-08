package com.example.tcsms.ResultJSON;

public class ResultJSON {
    private Integer code;//状态码
    private Boolean success;//状态
    private String massege;//消息
    private Object result;//数据对象

    public ResultJSON(){

    }

    public ResultJSON(Integer code, Boolean success, String massege, Object result) {
        this.code = code;
        this.success = success;
        this.massege = massege;
        this.result = result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMassege() {
        return massege;
    }

    public void setMassege(String massege) {
        this.massege = massege;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String toString() {
        return "{" +
                "\"code\":" + code +
                ", \"success\":" + success +
                ", \"massege\":" + "\"" + massege + "\"" +
                ", \"result\":" + result +
                "}";
    }
}

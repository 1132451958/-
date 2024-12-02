package com.quanxiaoha.framework.common.response;

import com.quanxiaoha.framework.common.exception.BaseExceptionInterface;
import com.quanxiaoha.framework.common.exception.BizException;
import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {
    private boolean success = true;
    private String message;
    private  String errorCode;
    private  T data;
    //success
    public static <T> Response<T> success(){
        Response<T> response = new Response<>();
        return response;
    }
    public static <T> Response<T> success(T data){
        Response<T> response = new Response<>();
        response.setData(data);
        return response;
    }
    //fail
    public static <T> Response<T> fail(){
        Response<T> response = new Response<>();
        response.setSuccess(false);
        return response;
    }
    public static <T> Response<T> fail(String errorCode){
        Response<T> response = new Response<>();
        response.setErrorCode(errorCode);
        return response;
    }
    public static <T> Response<T> fail(String errorCode, String errorMessage) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(errorCode);
        response.setMessage(errorMessage);
        return response;
    }
    public static <T> Response<T> fail(BizException bizException) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(bizException.getErrorCode());
        response.setMessage(bizException.getErrorMessage());
        return response;
    }

    public static <T> Response<T> fail(BaseExceptionInterface baseExceptionInterface) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(baseExceptionInterface.getErrorCode());
        response.setMessage(baseExceptionInterface.getErrorMessage());
        return response;
    }

}

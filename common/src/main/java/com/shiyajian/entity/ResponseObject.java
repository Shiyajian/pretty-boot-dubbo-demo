package com.shiyajian.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseObject<T> {

    private Integer status;

    private T data;

    private String msg;

    private ResponseObject( T t, Integer status ) {
        this.data = t;
        this.status = status;
    }

    public static ResponseObject ok( Object t ) {
        return new ResponseObject(t, 200);
    }
}

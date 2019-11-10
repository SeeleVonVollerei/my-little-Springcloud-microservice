package com.seele.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseBody implements Serializable {
    private int status;
    private Object body;

    public static ResponseBody success(Object body){
        return new ResponseBody(200,body);
    }
}

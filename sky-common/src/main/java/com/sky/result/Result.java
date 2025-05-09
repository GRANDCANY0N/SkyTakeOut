package com.sky.result;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Canyon
 */
@Data
public class Result<T> implements Serializable {
    /**
     * 编码：1表示正确，0和其他表示错误
     */
    private Integer code;
    /**
     * 错误信息
     */
    private String msg;
    /**
     * 泛型数据
     */
    private T data;

    public static <T> Result<T> success(T object){
        Result<T> res = new Result<T>();
        res.data = object;
        res.code = 1;
        return res;
    }

    public static <T> Result<T> error(String msg){
        Result<T> res = new Result<>();
        res.code = 0;
        res.msg = msg;
        return res;
    }

    public static <T> Result<T> success() {
        return success(null);
    }
}

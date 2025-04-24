package com.sky.handler;


import com.sky.exception.BaseException;
import com.sky.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 捕获业务异常
     * @param ex 自定义业务异常
     * @return 返回封装的错误信息
     */
    @ExceptionHandler
    public Result<Void> exceptionHandler(BaseException ex){
        log.error("异常信息：{}", ex.getMessage());
        return Result.error(ex.getMessage());
    }

//    @ExceptionHandler
//    public Result exceptionHandler(SQLIntegrityConstraintViolationException ex){
//        String message =  ex.getMessage();
//        if(message.contains("Duplicate entry")){
//            String[] split = message.split(" ");
//            String username = split[2];
//            String msg = username + MessageConstant.ACCOUNT_EXISTS;
//            return Result.error(msg);
//        }else{
//            return Result.error(MessageConstant.UNKNOWN_ERROR);
//        }
//    }
}


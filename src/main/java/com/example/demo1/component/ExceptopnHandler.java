package com.example.demo1.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Slf4j
@RestControllerAdvice
public class ExceptopnHandler {
    @ExceptionHandler(value = {ArithmeticException.class})
    public void exceptionHandler1(Exception e){

        log.error("全局异常：{}",e.getMessage());
    }
}

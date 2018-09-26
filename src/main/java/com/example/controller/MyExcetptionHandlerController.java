package com.example.controller;

import com.example.exception.MyNullPointerExcetpion;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author:zhang.zhang
 * @Date:2018/8/14 17:56
 */
@RestController
public class MyExcetptionHandlerController {
    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String exceptionHandler(Exception e){
        return "["+e.getClass()+"]确实由exceptionHandler处理了";
    }
    @RequestMapping("/testException/{num}")
    public String testException(@PathVariable String num) throws Exception{
        if("1".equals(num)){
            System.out.println("抛MyNullPointerException");
            throw new MyNullPointerExcetpion();
        }
        if("2".equals(num)){
            System.out.println("抛MyNullPointerException");
            throw new MyNullPointerExcetpion();
        }
        return "没有异常";
    }
}

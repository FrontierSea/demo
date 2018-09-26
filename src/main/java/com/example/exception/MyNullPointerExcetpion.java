package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Description:
 * @Author:zhang.zhang
 * @Date:2018/8/14 17:59
 */
@ResponseStatus(value=HttpStatus.BAD_GATEWAY,reason = "我随便写的理由")
public class MyNullPointerExcetpion extends Exception {

}

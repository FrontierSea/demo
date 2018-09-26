package com.example.designpattern.mediator;

/**
 * @Description:
 * @Author:zhang.zhang
 * @Date:2018/9/25 19:26
 */
public interface Mediator {
    void register(String dname,Department d);
    void command(String dname);
}

package com.example.designpattern.mediator;

/**
 * @Description:
 * @Author:zhang.zhang
 * @Date:2018/9/25 19:27
 */
public interface Department {
    /**
     * 做本部门事情
     */
    void selfAction();
    /**
     * 请求其他部门
     */
    void outAction();
}

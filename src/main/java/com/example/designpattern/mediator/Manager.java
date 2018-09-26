package com.example.designpattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author:zhang.zhang
 * @Date:2018/9/25 19:37
 */
public class Manager implements Mediator {
    Map<String,Department> map = new HashMap<>();
    @Override
    public void register(String dname, Department d) {
        map.put(dname,d);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }
}

package com.example.designpattern.mediator;

/**
 * @Description:
 * @Author:zhang.zhang
 * @Date:2018/9/25 19:28
 */
public class Developement implements Department {
    private Mediator mediator;

    public Developement(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void selfAction() {
        System.out.println("研发部门，专注研发");
    }

    @Override
    public void outAction() {
        System.out.println("请求财务部门帮忙");
        mediator.command("财务");
    }
}

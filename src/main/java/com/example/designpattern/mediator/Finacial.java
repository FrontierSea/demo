package com.example.designpattern.mediator;

/**
 * @Description:
 * @Author:zhang.zhang
 * @Date:2018/9/25 19:28
 */
public class Finacial implements Department {
    private Mediator mediator;

    public Finacial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("财务",this);
    }

    @Override
    public void selfAction() {
        System.out.println("财务部门负责数钱");
    }

    @Override
    public void outAction() {
    }
}

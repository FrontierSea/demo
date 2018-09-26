package com.example.designpattern.mediator;

/**
 * @Description:
 * @Author:zhang.zhang
 * @Date:2018/9/25 19:42
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Manager();
        Developement developement = new Developement(mediator);
        Finacial finacial = new Finacial(mediator);
        developement.selfAction();
        developement.outAction();
    }
}

package com.example.model;

/**
 * @description:
 * @author:clay
 * @date:2018-07-19 11:31
 */
public class User {
    private Integer id;//用户id
    private String username;//用户名
    private String password;//密码
    private Integer age;//年龄

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

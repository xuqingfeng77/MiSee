package com.eposp.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by xuqingfeng on 16/5/13.
 */
public class UserB extends BmobObject {
    private String name;//
    private String pwd;
    private Integer age;    //Integer类型
    private Boolean gender; //Boolean类型

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

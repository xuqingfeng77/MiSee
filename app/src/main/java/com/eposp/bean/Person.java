package com.eposp.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by xuqingfeng on 16/5/13.
 */
public class Person  extends BmobObject {
    private String name;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}

package com.arpitparekh.jigneshandroidmodule.pass_object_activity;

import java.io.Serializable;

public class Student implements Serializable {

    String name;
    String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "name= " + name+
                "\naddress= " + address;
    }
}

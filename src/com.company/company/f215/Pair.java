package com.company.f215;

public class Pair {
    public int getKey() {
        return key;
    }
    public Pair(int key,int value){
        this.key = key;
        this.value = value;
    }
    public void setKey(int key) {
        this.key = key;
    }

    int key;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    int value;


}

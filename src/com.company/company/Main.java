package com.company;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    String test = "level:0,risk_type:appid,risk_tag:1-2-2003";
    String[] param = test.split(",");
    public String deviceInfoLevel = param[0].split(":")[1];
    public String deviceInfoTag = param[2].split(":")[1];
    public String p = "[\\S]";
    public String[] getDeviceInfoLevel = test.split("[,][.]*[:]");
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Level:"+main.deviceInfoLevel+" deviceInfoTag:"+ main.deviceInfoTag);
        System.out.println(main.getDeviceInfoLevel[0]);



    }
}

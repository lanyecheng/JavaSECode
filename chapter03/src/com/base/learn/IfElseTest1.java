package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/4/5
 * 成年人心率的正常范围是每分钟60-100次。体检时，如果心率不在此范围内，则提示需要做进一步的检查
 */
public class IfElseTest1 {
    public static void main(String[] args) {
        int heartBeats = 110;

        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("你需要进一步检查");
        }
        System.out.println("体检结束");
    }
}

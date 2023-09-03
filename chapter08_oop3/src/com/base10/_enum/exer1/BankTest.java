package com.base10._enum.exer1;

/**
 * @Author myf15609
 * @Date 2023/9/3
 */
public class BankTest {
    public static void main(String[] args) {
        System.out.println(GirlFriend.ZHANG_SAN);

    }
}

enum bank {
    BANK;
}

enum GirlFriend {
    ZHANG_SAN(20);


    private final int age;

    GirlFriend(int age) {
        this.age = age;
    }
}
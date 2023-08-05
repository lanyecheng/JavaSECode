package com.base.exer1;

/**
 * @Author myf15609
 * @Date 2023/4/12
 */
public class Person {
    String name;
    int age;
    int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println(age);
    }

    public void addAge(int i) {
        age += i;
    }
}

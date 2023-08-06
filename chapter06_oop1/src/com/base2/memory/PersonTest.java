package com.base2.memory;

/**
 * @Author myf15609
 * @Date 2023/4/12
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "张三";
        p1.sex = 1;

        p1.study();
        p1.addAge(5);
        p1.showAge();

    }
}

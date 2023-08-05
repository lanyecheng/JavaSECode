package com.base.learn1;

import com.sun.org.apache.xml.internal.serializer.ToStream;

/**
 * @Author myf15609
 * @Date 2023/4/10
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.id = 1001;
        emp1.name = "杰克";
        emp1.age = 24;
        emp1.salary = 8900;

        emp1.birthday = new MyDate();
        emp1.birthday.year = 2023;
        emp1.birthday.month = 4;
        emp1.birthday.day = 10;

        System.out.println("id = " + emp1.id + ",name = " + emp1.name + ",age = " + emp1.age + ",salary = " + emp1.salary + ","
                + emp1.birthday.year + "-" + emp1.birthday.month + "-" + emp1.birthday.day);
    }
}

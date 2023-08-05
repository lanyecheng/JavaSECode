package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/4/10
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 1001;
        emp1.name = "Tom";
        emp1.age = 24;
        emp1.salary = 7800;

        System.out.println("id = " + emp1.id + ",name = " + emp1.name +
                ",age = " + emp1.age + ",salary = " + emp1.salary);
    }
}

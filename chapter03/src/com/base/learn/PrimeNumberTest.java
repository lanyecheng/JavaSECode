package com.base.learn;

/**
 * @Author myf15609
 * @Date 2024/2/5
 * 100以内的所有质数的输出
 * 质数：只能被1和它本身整除的自然数
 */
public class PrimeNumberTest {
    public static void main(String[] args) {
        boolean isFlag = true;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isFlag = false;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
            isFlag = true;
        }
    }
}

package com.base.learn;

import sun.management.Agent;

/**
 * @Author myf15609
 * @Date 2023/4/7
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int[] scores = {5, 4, 6, 9, 0, 3, 7, 10, 8, 9};
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
            if (min > scores[i]) {
                min = scores[i];
            }
            sum += scores[i];
        }
        int avg = (sum - max - min) / (scores.length - 2);
        System.out.println("平均值：" + avg);
    }
}

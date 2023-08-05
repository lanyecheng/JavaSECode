package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/4/7
 * 数组对称位置的元素互换
 */
public class TestArrayReverse1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}

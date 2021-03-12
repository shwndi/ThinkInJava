package com.company.array;

/**
 * 数组排序
 *
 * @author czy
 * @date 2020-8-5
 */
public class ArraySort {
    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static void print(int[] a) {
        String result = "[";
        if (a != null && a.length != 0) {
            for (int i : a) {
                result += i + ", ";
            }
            result = result.substring(0, result.length() - 2);
        }
        result += "]";
        System.out.println(result);
    }

    public static int[] reverse(int[] a) {
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] b = {};
        ArraySort.print(b);
        ArraySort.reverse(b);
        ArraySort.print(b);
        int[] a = {10, 2, 4, 8, 9, 5, 7, 6, 1, 3, 0,};
        ArraySort.print(a);
//		ArraySort.sort(a);
        ArraySort.reverse(a);
        ArraySort.print(a);
    }
}

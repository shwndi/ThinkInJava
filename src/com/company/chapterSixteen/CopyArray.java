package com.company.chapterSixteen;

import java.util.Arrays;

/**
 * 数组赋复制
 * 复制内容
 * @author czy
 * @date 2021/2/2
 */
public class CopyArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = new int[7];
        Arrays.fill(b,11);
        System.arraycopy(a,0,b,3, 2);
        System.out.println(Arrays.toString(b));
    }
}

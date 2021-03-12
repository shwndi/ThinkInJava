package dateType;

import com.company.chaptertwo.A;

import java.util.Arrays;

/**
 * 赋值操作：将数组对象的引用赋值给另一个数组对象。
 * 改变其中一个中的常量，数组对象同时改变
 *
 * @author czy
 * @date 2021/2/1
 */
public class Array {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4};
        Integer[] b;
        b = a;
        System.out.println(Arrays.toString(b));
        a[1] = 9;
        System.out.println(Arrays.toString(b));
        int[] c = {1, 2, 3, 4};
        int[] d;
        d = c;
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        c[1] = 8;
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
    }
}

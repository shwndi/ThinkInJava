package com.company.chapterSixteen;

import org.openjdk.jol.info.ClassLayout;

import java.util.Arrays;

/**
 * @author czy
 * @date 2021/2/1
 */
public class ArrayOptions {
    public static void main(String[] args) {
        BerylliumSphere[] a;
        BerylliumSphere[] b=new BerylliumSphere[5];
        System.out.println("b: "+ Arrays.toString(b));
        BerylliumSphere[] c =new BerylliumSphere[4];
        for (int i = 0; i < c.length; i++) {
            if (c[i]==null){
                c[i]= new BerylliumSphere();
            }
        }
        BerylliumSphere[] d= {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()};
        a=new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()};
        System.out.println("a.length = "+a.length);
        System.out.println("b.length = "+b.length);
        System.out.println("c.length = "+c.length);
        System.out.println("d.length = "+d.length);
        a=d;
        System.out.println("a.length = "+a.length);
        int[] e;
        int[] f = new int[5];
        System.out.println("f: "+Arrays.toString(f));
        int[] g=new int[4];
        for (int i = 0; i < g.length; i++) {
            g[i]=i*i;
        }
        int[] h={11,46,93};
        System.out.println("f.length = "+f.length);
        System.out.println("g.length = "+g.length);
        System.out.println("h.length = "+h.length);
        e=h;
        System.out.println("e.length = "+e.length);
        e= new int[]{1,2};
        System.out.println("e.length = "+e.length);
        char[] chars = new char[3];
        double[] doubles = new double[3];
        boolean[] booleans = new boolean[3];
        for (char ch : chars) {
            System.out.println((int) ch);
        }
        System.out.println((char)65);
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(doubles));
        System.out.println(Arrays.toString(booleans));
        String s = ClassLayout.parseClass(int.class).toPrintable();
        System.out.println(s);
    }
}

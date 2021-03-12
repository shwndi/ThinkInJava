package com.company.chaptertwo;


import static com.sun.deploy.trace.Trace.print;

/**
 * @author 123
 * @author 456
 * @author czy
 * @version 1.3
 */
public class Strictfp {

    public static strictfp void main(String[] args) {
        // write your code here
        System.out.println("the strictfp be used. ");
        double pi = Math.PI;
        double e = Math.E;
        double result = pi / e;
        System.out.println(pi + "\t" + e + "\t" + result);
        print(pi + "\t" + e + "\t" + result);
    }
}

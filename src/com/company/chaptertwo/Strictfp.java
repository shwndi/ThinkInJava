package com.company.chaptertwo;


import static com.sun.deploy.trace.Trace.print;

/**
 * @version 1.2
 * @version 1.3
 * @author 123
 * @author 456
 * @author czy
 */
public class Strictfp {

    public static strictfp void main(String[] args) {
	// write your code here
        System.out.println("the strictfp be used. ");
        double pi = Math.PI;
        double e = Math.E;
        double result = pi/e;
        System.out.println(pi+"\t"+e+"\t"+result);
        print(pi+"\t"+e+"\t"+result);
    }
}

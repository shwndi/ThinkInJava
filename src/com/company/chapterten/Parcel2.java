package com.company.chapterten;

import com.sun.org.apache.bcel.internal.classfile.Constant;

/**
 * 内部类实例2
 *
 * @author czy
 * @date 2020-7-28
 */
public class Parcel2 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents contents = new Contents();
        Destination destination = new Destination(dest);
        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tas");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("AHDFUHA");
    }
}

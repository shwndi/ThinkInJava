package com.company.chapterten;

/**
 * @author czy
 * @date 2020-7-31
 */
public class Pracel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;

            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget !");
                }
            }

            private String label = dest;

            @Override
            public String readLable() {
                System.out.println(label);
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Pracel10 pracel10 = new Pracel10();
        Destination test = pracel10.destination("test", 101.253F);
        test.readLable();
    }
}

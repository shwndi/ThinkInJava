package com.company.chapterfive;

/**
 * 橱柜
 *
 * @author czy
 * @date 2020-7-11
 */
public class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        System.out.println("Cupboard");
        bowl4.fBowl(2);
    }

    void fCupboard(int mark) {
        System.out.println("fCupboard:\t" + mark);
    }

    static Bowl bowl5 = new Bowl(5);
}

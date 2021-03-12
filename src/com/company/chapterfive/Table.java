package com.company.chapterfive;

/**
 * 桌子
 *
 * @author czy
 * @date 2020-7-11
 */
public class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Table");
        bowl2.fBowl(1);
    }

    void fTable(int mark) {
        System.out.println("f2:\t" + mark);
    }

    static Bowl bowl2 = new Bowl(2);
}

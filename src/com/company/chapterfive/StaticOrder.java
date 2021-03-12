package com.company.chapterfive;

/**
 * 静态数据初始化
 *
 * @author czy
 * @date 2020-7-11
 */
public class StaticOrder {
    public static void main(String[] args) {
        System.out.println("Creat new Cupboard in main");
        new Cupboard();
        System.out.println("Creat new Cupboard in main");
        new Cupboard();
        table.fTable(1);
        cupboard.fCupboard(2);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}

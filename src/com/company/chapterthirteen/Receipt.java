package com.company.chapterthirteen;

import java.util.Formatter;

/**
 * @author czy
 * @date 2020-10-15
 */
public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n", "____", "___", "_____");
    }

    public void print(String name, int qty, double price) {
        f.format("%-15.15s %5d %10.2f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format("%-10s %5s %10.2f\n", "Tax", "", total * 0.06);
        f.format("%-10s %5s %10s\n", "", "", "-----");
        f.format("%-10s %5s %10.2f\n", "Tax", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("jack`s Magic Beans", 4, 4.25);
        receipt.print("Princess peas", 3, 5.1);
        receipt.print("Three Bears porridge", 1, 14.29);
        receipt.printTotal();
    }
}

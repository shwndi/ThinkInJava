package com.company.chapterseven;

/**
 * 继承（super）
 *
 * @author czy
 * @date 2020-7-16
 */
public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("dog");
    }

    public Dog(String s) {
        super(s);
        System.out.println("String of dog");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.up(1);
    }
}

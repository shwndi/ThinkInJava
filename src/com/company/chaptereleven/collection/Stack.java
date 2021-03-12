package com.company.chaptereleven.collection;

import java.util.LinkedList;

/**
 * 栈的实现
 *
 * @author czy
 * @date 2020-9-24
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }

    //演示
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "afsadfadfsdafafasd".split("a")) {
            stack.push(s);
        }
        System.out.println(stack);
        while (!stack.empty()) {
            String pop = stack.pop();
            System.out.println(pop);
        }
    }
}

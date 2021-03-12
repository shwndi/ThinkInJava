package com.company.chapterfifteen;

/**
 * @author czy
 * @date 2021-1-4
 */
public class LinkedStack5<T> {
    private class Node {
        T item;
        Node next;

        Node() {
            item = null;
            next = null;
        }

        Node(T item, Node next) {
            this.item = item;
            this.next = next;
            System.out.println(top);
        }

        boolean end() {
            return item == null && next == null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", next=" + next +
                    '}';
        }
    }

    private Node top = new Node(); // End sentinel

    public void push(T item) {
        top = new Node(item, top);
        System.out.println("push :" + top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        System.out.println("pop :" + top);
        System.out.println("pop :" + result);
        return result;
    }

    public static void main(String[] args) {
        LinkedStack5<String> lss = new LinkedStack5<String>();
        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }
}

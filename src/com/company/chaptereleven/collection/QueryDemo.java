package com.company.chaptereleven.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author czy
 * @date 2020-9-25
 */
public class QueryDemo {
    public static void printQ(Queue query) {
        while (query.peek() != null) {
            System.out.print(query.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> query = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            query.offer(random.nextInt((i + 10)));
        }
        printQ(query);
        Queue<Character> qc = new LinkedList<>();
        for (char c : "hafkhfaa".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }
}

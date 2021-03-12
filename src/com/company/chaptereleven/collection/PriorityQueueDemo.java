package com.company.chaptereleven.collection;

import java.util.*;

/**
 * @author czy
 * @date 2020-9-25
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQuery = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQuery.offer(random.nextInt(i + 10));
        }
        QueryDemo.printQ(priorityQuery);
        List<Integer> its = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQuery = new PriorityQueue<>(its);
        QueryDemo.printQ(priorityQuery);
        priorityQuery = new PriorityQueue<Integer>(its.size(), Collections.reverseOrder());
        priorityQuery.addAll(its);
        QueryDemo.printQ(priorityQuery);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(" "));
        PriorityQueue<String> stringsPQ = new PriorityQueue<>(strings);
        QueryDemo.printQ(stringsPQ);
        stringsPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
        stringsPQ.addAll(strings);
        QueryDemo.printQ(stringsPQ);

        Set<Character> charSet = new HashSet<>();
        for (char c : fact.toCharArray()) {
            charSet.add(c);
        }
        PriorityQueue<Character> characterPyQ = new PriorityQueue<>(charSet);
        QueryDemo.printQ(characterPyQ);
    }
}

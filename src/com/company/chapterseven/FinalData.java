package com.company.chapterseven;

import java.util.Random;

/**
 * @author czy
 * @date 2020-7-20
 */
public class FinalData {
    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 19;
    private static final int valueTwo = 29;
    public static final int valueThree = 39;

}

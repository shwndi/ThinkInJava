package com.company.chapterSeventeen.nine;

import java.util.Random;

/**
 * @author czy
 * @date 2021/2/4
 */
public class Prediction {
    private static Random rand = new Random(47);
    private boolean shadow = rand.nextDouble()>0.5;

    @Override
    public String toString() {
        if (shadow){
            return "Six more weeks of Winter";
        }else {
            return "Early spring";
        }
    }
}

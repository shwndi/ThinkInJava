package com.company.chapterfifteen.drinks;

/**
 * 咖啡
 *
 * @author czy
 * @date 2021-1-4
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

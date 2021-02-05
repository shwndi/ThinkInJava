package com.company.chapterSeventeen.nine;

import java.util.Objects;

/**
 * @author czy
 * @date 2021/2/4
 */
public class Groundhog {
    protected int number;

    public Groundhog(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Groundhog #" + number;
    }

}

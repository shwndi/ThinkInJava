package com.company.chapnineteen;

import java.util.EnumSet;

import static com.company.chapnineteen.AlarmPoints.*;

/**
 * @author czy
 * @date 2021/3/16
 */
public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points =
                EnumSet.noneOf(AlarmPoints.class);
        points.add(BATHROOM);
        System.out.println(points);
        points.addAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        System.out.println(points);
        points = EnumSet.allOf(AlarmPoints.class);
        points.removeAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        System.out.println(points);
        points.removeAll(EnumSet.range(OFFICE1,OFFICE4));
        System.out.println(points);
        points = EnumSet.complementOf(points);
        System.out.println(points);
    }
}

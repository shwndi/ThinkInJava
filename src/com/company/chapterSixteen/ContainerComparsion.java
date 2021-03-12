package com.company.chapterSixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author czy
 * @date 2021/2/1
 */
class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Sphere " + id;
    }
}

public class ContainerComparsion {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for (int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);

        List<BerylliumSphere> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new BerylliumSphere());
        }
        System.out.println(list);
        System.out.println(list.get(4));
    }

}

package com.company.chapterfifteen;

import java.util.*;

/**
 * @author czy
 * @date 2021/1/26
 */
class Frob<U> {
}

class Fnorkle {
}

class Quark<Q> {
}

class Particle<POSITION, MOMENTUM> {
}

public class LostInfromation {
    public static void main(String[] args) {
        List<Frob> list = new ArrayList<>();
        Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
        Quark<Fnorkle> quark = new Quark<>();
        Particle<Long, Double> p = new Particle<>();
        Frob<Object> objectFrob = new Frob<>();
        System.out.println(Arrays.toString(objectFrob.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));

    }
}

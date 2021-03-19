package com.company.chapnineteen;

import static com.company.chapnineteen.StaticEnum.MEDIUM;
import static com.company.chapnineteen.StaticEnum.NOT;

/**
 * @author czy
 * @date 2021/3/15
 */

public class Burrito{
    public StaticEnum staticEnum;
    public Burrito (StaticEnum staticEnum){
        this.staticEnum=staticEnum;
    }

    @Override
    public String toString() {
        return "staticEnum=" + staticEnum;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
    }
}


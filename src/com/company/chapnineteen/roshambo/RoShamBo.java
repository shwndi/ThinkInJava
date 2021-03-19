package com.company.chapnineteen.roshambo;

import com.company.chapnineteen.Enums;

/**
 * @author czy
 * @date 2021/3/18
 */
public class RoShamBo {
    public static <T extends Competitor<T>>
    void match(T a ,T b){
        System.out.println(a+" vs "+b+" : "+a.compete(b));
    }
    public static <T extends Enum<T>&Competitor<T>>
    void play(Class<T> rbsClass,int size){
        for (int i = 0; i < size; i++) {
            match(
                    Enums.random(rbsClass),Enums.random(rbsClass);
            );
        }
    }
}


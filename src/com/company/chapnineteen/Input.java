package com.company.chapnineteen;

import java.util.Random;

/**
 * @author czy
 * @date 2021/3/18
 */
public enum Input {
    NICKEL(),DIME(),QUARTER(),DOLLAR(),
    TOOTHPASTE(),CHIPS(),SODA(),SOAP(),
    ABORT_TRANSACTION{
        @Override
        public int amount(){
            throw new RuntimeException("ABORT.amount()");
        }
    },
    STOP{
        @Override
        public int amount(){
            throw new RuntimeException("SHUT_DOWN.amount()");
        }
    };
    int value;
    Input(){}
    Input(int value){this.value = value;}
    int amount(){return value;}
    static Random ran = new Random(47);
    public static Input randomSelection(){
        return values()[ran.nextInt(values().length)-1];
    }


}

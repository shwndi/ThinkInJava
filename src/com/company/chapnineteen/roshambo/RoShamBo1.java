package com.company.chapnineteen.roshambo;

import static com.company.chapnineteen.roshambo.Outcome.*;

import java.util.Random;

/**
 *enum 是实例，不是类型不能当作参数类型，因此无法重载eval()方法
 * @author czy
 * @date 2021/3/18
 */
interface Item {
    Outcome compete(Item it);

    Outcome eval(Paper p);

    Outcome eval(Scssors s);

    Outcome eval(Rock s);
}

class Paper implements Item {
    @Override
    public Outcome compete(Item it) {
        return it.eval(this);
    }

    @Override
    public Outcome eval(Paper p) {
        return DRAW;
    }

    @Override
    public Outcome eval(Scssors s) {
        return WIN;
    }

    @Override
    public Outcome eval(Rock s) {
        return LOSE;
    }

    @Override
    public String toString() {
        return "Paper";
    }
}

class Scssors implements Item {
    @Override
    public Outcome compete(Item it) {
        return it.eval(this);
    }

    @Override
    public Outcome eval(Paper p) {
        return LOSE;
    }

    @Override
    public Outcome eval(Scssors s) {
        return DRAW;
    }

    @Override
    public Outcome eval(Rock s) {
        return WIN;
    }

    @Override
    public String toString() {
        return "Scssors";
    }
}

class Rock implements Item {
    @Override
    public Outcome compete(Item it) {
        return it.eval(this);
    }

    @Override
    public Outcome eval(Paper p) {
        return WIN;
    }

    @Override
    public Outcome eval(Scssors s) {
        return LOSE;
    }

    @Override
    public Outcome eval(Rock s) {
        return DRAW;
    }

    @Override
    public String toString() {
        return "Rock";
    }
}

public class RoShamBo1 {
    static final int SIZE = 20;
    private static Random random = new Random(47);

    public static Item newItem() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Scssors();
            case 1:
                return new Paper();
            case 2:
                return new Rock();
        }
    }

    public static void match(Item a,Item b){
        System.out.println();
        a+" vs "+b +" : " +a.compete(b);
    }
    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            match(newItem(),newItem());
        }
    }

}

package com.company.chapnineteen;

import com.company.chapnineteen.food.Food;
import static com.company.chapnineteen.food.Food.*;

/**
 * @author czy
 * @date 2021/3/16
 */
public class TypeOfFood {
    public static void main(String[] args) {
        Food food= Appetizer.SALAD;
        food = MainCourse.LENTILS;
        food = Dessert.GELATO;
        food = Coffee.CAPPUCCINO;
    }
}

package com.company.chapnineteen;

import com.company.chapnineteen.food.Food;

/**
 * @author czy
 * @date 2021/3/16
 */
public enum Course {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    DOFFEE(Food.Coffee.class);
    private Food[] values;
    private Course(Class<? extends  Food> kind){
        values = kind.getEnumConstants();
    }
    public Food randomSelection(){
        return Enums.random(values);
    }
}

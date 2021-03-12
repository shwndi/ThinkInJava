package com.company.chapterfourteen;

import com.company.chapterfourteen.individual.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 字面值常量实现类统计
 *
 * @author czy
 * @date 2020-12-3
 */
public class LiteralPetCreator extends PetCreator {

    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class, EgyptionMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class, Hamster.class
            ));

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());

    public static void main(String[] args) {
        System.out.println(types);
    }
}

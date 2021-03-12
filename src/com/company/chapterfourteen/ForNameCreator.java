package com.company.chapterfourteen;

import com.company.chapterfourteen.individual.Pet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czy
 * @date 2020-12-3
 */
public class ForNameCreator extends PetCreator {

    public static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "com.company.chapterfourteen.individual.Mutt",
            "com.company.chapterfourteen.individual.Pug",
            "com.company.chapterfourteen.individual.EgyptionMau",
            "com.company.chapterfourteen.individual.Manx",
            "com.company.chapterfourteen.individual.Cymric",
            "com.company.chapterfourteen.individual.Rat",
            "com.company.chapterfourteen.individual.Mouse",
            "com.company.chapterfourteen.individual.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String typeName : typeNames) {
                types.add(
                        (Class<? extends Pet>) Class.forName(typeName)
                );
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    static {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        ForNameCreator forNameCreator = new ForNameCreator();
//		List<Class<? extends Pet>> types = forNameCreator.types();
//		System.out.println(types);
        Pet[] pets = forNameCreator.createArrays(7);
        System.out.println(pets.getClass().getSimpleName());
    }
}

package com.company.chapterfourteen;

import com.company.chapterfourteen.individual.Pet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author czy
 * @date 2020-12-2
 */
public abstract class PetCreator {
    public Random rand = new Random(47);

    public abstract List<Class<? extends Pet>> types();

    public Pet randomPet() {
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public Pet[] createArrays(int size) {
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++) {
            result[i] = randomPet();
        }
        return result;
    }

    public ArrayList<Pet> arraylist(int size) {
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result, createArrays(size));
        return result;
    }
}

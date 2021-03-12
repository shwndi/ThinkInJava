package com.company.chapterfourteen;

import com.company.chapterfourteen.individual.Pet;

/**
 * @author czy
 * @date 2020-12-3
 */
public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.arrayList(20)) {
            System.out.println(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
}

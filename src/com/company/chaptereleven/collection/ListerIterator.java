package com.company.chaptereleven.collection;

import com.company.vo.Pet;

import java.util.List;
import java.util.ListIterator;

/**
 * @author czy
 * @date 2020-9-24
 */
public class ListerIterator {
    public static void main(String[] args) {
        List<Pet> petList = Pet.arrayList(8);
        ListIterator<Pet> it = petList.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next() + "," + it.nextIndex() + "," + it.previousIndex());
        }
        System.out.println("-----------------------------");

        while (it.hasPrevious()) {
            System.out.println(it.previous() + "," + it.previousIndex() + "," + it.nextIndex());
        }
        System.out.println("------------------------------");
        System.out.println(petList);
        it = petList.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.set(Pet.randomPet());
        }
        System.out.println(petList);

    }
}

package com.company.chaptereleven.collection;

import com.company.vo.Pet;
import com.company.vo.childen.Cymric;
import com.company.vo.childen.Hamster;
import com.company.vo.childen.Mouse;

import java.util.*;

/**
 * @author czy
 * @date 2020-9-24
 */
public class ListTest2 {
    public static void main(String[] args) {
        Random random = new Random(47);
//		for (int a = 0; a < 10; a++) {
//			int i = random.nextInt(7);
//			System.out.println(i);
//		}
        List<Pet> pets = Pet.arrayList(7);
        System.out.println("1:" + pets);
        Hamster hamster = new Hamster();
        pets.add(hamster);
        System.out.println("2:" + pets);
        System.out.println("3:" + pets.contains(hamster));
        pets.remove(hamster);
        Pet pet = pets.get(2);
        System.out.println("4:" + pet + pets.indexOf(pet));
        Pet cymric = new Cymric();
        System.out.println("5:" + pets.indexOf(cymric));
        System.out.println("6:" + pets.remove(cymric));
        System.out.println("7:" + pets.remove(pet));
        System.out.println("8:" + pets);
        pets.add(3, new Mouse());
        System.out.println("9:" + pets);
        //1<=index<4
        List<Pet> sub = pets.subList(1, 4);
        System.out.println("sublist:" + sub);
        System.out.println("10:" + pets.containsAll(sub));
        Collections.sort(sub, new Comparator<Pet>() {
            @Override
            public int compare(Pet a, Pet b) {
                return a.toString().compareTo(b.toString());
            }
        });
        System.out.println("sorted sublist:" + sub);
        System.out.println("11:" + pets.containsAll(sub));

        Collections.shuffle(sub, random);
        System.out.println("shuffled subList :" + sub);
        System.out.println("12:" + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<Pet>(pets);
        System.out.println("--------------------------\t" + pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub:" + sub);
        copy.containsAll(sub);
        System.out.println("13:" + copy);
        copy = new ArrayList<Pet>(pets);
        copy.remove(2);
        System.out.println("14:" + copy);
        copy.removeAll(sub);
        System.out.println("15:" + copy);
        copy.set(1, new Mouse());
        System.out.println("16:" + copy);
        copy.addAll(2, sub);
        System.out.println("17:" + copy);
        System.out.println("18:" + pets.isEmpty());
        pets.clear();
        System.out.println("19:" + pets);
        System.out.println("20:" + pets.isEmpty());
        pets.addAll(Pet.arrayList(4));
        System.out.println("21:" + pets);
        Object[] o = pets.toArray();
        System.out.println("22:" + o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        System.out.println("23:" + pa[3].id());


    }
}

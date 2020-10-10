package com.company.chaptereleven.collection;

import com.company.vo.Pet;

import java.util.*;

/**
 * @author czy
 * @date 2020-9-25
 */
public class InterfaceVsIterator {
	public static void disPlay(Iterator<Pet> it){
		while (it.hasNext()){
			Pet next = it.next();
			System.out.print(next.id() + ":" + next +"  ");
		}
		System.out.println();
	}
	public static void disPlay(Collection<Pet> pets){
		for (Pet pet : pets) {
			System.out.print(pet.id() +":"+pet +"  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<Pet> petList = Pet.arrayList(8);
		Set<Pet> petSet = new HashSet<>(petList);
		Map<String, Pet> petMap = new LinkedHashMap<>();
		String[] names = ("Ralph,Eric,Robin,Lacey,Britney,Sam,Spot,Fluffy").split(",");
		for (int i = 0; i < names.length; i++) {
			petMap.put(names[i], petList.get(i));
		}
		disPlay(petList);
		disPlay(petSet);
		disPlay(petList.iterator());
		disPlay(petSet.iterator());
		System.out.println(petMap);
		System.out.println(petMap.keySet());
		disPlay(petMap.values());
		disPlay(petMap.values().iterator());

	}
}

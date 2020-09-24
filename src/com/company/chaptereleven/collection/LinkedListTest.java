package com.company.chaptereleven.collection;

import com.company.vo.Pet;

import java.util.LinkedList;
import java.util.Stack;


/**
 * @author czy
 * @date 2020-9-24
 */
public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Pet> pets = new LinkedList<>(Pet.arrayList(5));
		System.out.println(pets);
		System.out.println("pets.getFirst():" + pets.getFirst());
		System.out.println("pets.element():" + pets.element());
		System.out.println("pets.peek():" + pets.peek());
		System.out.println("pets.remove():" + pets.remove());
		System.out.println("pets.removeFirst():" + pets.removeFirst());
		System.out.println("pets.poll():" + pets.poll());
		System.out.println("pets.removeLast():"+ pets.removeLast());
		boolean add = pets.add(Pet.randomPet());
		System.out.println(add +""+ pets);
		pets.addFirst(Pet.randomPet());
		System.out.println(pets);
		pets.addLast(Pet.randomPet());
		System.out.println(pets);
	}
}

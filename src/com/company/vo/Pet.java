package com.company.vo;

import com.company.vo.childen.*;

import java.util.*;

/**
 * 宠物
 *
 * @author czy
 * @date 2020-9-18
 */
public class Pet {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String id;

    private final static List<Pet> pets = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(this.toString(), pet.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }

    static {
        pets.add(new Cymric());
        pets.add(new EgyptianMau());
        pets.add(new Hamster());
        pets.add(new Manx());
        pets.add(new Mouse());
        pets.add(new Mutt());
        pets.add(new Pug());
        pets.add(new Rat());
    }

    public static Pet randomPet() {
        Random random = new Random();
        int a = random.nextInt(7);
        return pets.get(a);
    }

    public static List<Pet> arrayList(int i) {
        Random random = new Random();
        List<Pet> petList = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            int a = random.nextInt(7);
            Pet pet = pets.get(a);
            pet.setId(String.valueOf(j));
            petList.add(pet);
        }
        return petList;
    }

    public static void main(String[] args) {
        List<Pet> petList = Pet.arrayList(3);
        System.out.println(petList);
    }

    @Override
    public String toString() {
        return "Pet";
    }

    public String id() {
        return id;
    }

	/*public static void main(String[] args) {
		//数组创建的三种方式
		Integer[] a = {1,2,3};
		Integer[] b = new Integer[3];
		b[0]=4;
		b[1]=5;
		b[2]=6;
		int[] c = new int[]{7,8,9};
		List<Integer> ints = new ArrayList(Arrays.asList(a));*/
		/*System.out.println(ints.toString());
		Integer[] d = new Integer[2];
		d = ints.toArray(d);
		System.out.println(d);
		ints.add(4);
		System.out.println(ints);*/
		/*List<Integer> integers = Arrays.asList(b);
		System.out.println(integers);
		integers.add(7);//直接转为List不能增减
		System.out.println(integers);
		List<String> collect = integers.parallelStream().map(item -> Integer.toString(item++)).collect(Collectors.toList());
		System.out.println(collect);
*/

		/*List<Integer> arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		*//*int size = arrayList.size();
		Integer integer = arrayList.get(size - 1);
		Integer o = arrayList.get(size-2);
		System.out.println(integer);
		System.out.println(o);*//*
		Iterator<Integer> iterator = arrayList.iterator();
		//iterator.remove();
		System.out.println(arrayList);
		Integer next1 = iterator.next();
		iterator.remove();
		System.out.println(arrayList);
	//	System.out.println("next="+next+";   next1="+next1);*/
    //}
}


package com.company.chapterfourteen;

import com.company.chapterfourteen.individual.Pet;

import java.util.ArrayList;

/**
 * @author czy
 * @date 2020-12-3
 */
public class Pets {
	public static final PetCreator creator =
			new LiteralPetCreator();
	public static Pet randomPet(){
		return creator.randomPet();
	}
	public static Pet[] createArray(int size){
		return creator.createArrays(size);
	}
	public static ArrayList<Pet> arrayList(int size){
		return creator.arraylist(size);
	}
}

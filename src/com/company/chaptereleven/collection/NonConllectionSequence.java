package com.company.chaptereleven.collection;

import com.company.vo.Pet;

import java.util.Iterator;
import java.util.List;

/**
 * @author czy
 * @date 2020-9-25
 */
public class NonConllectionSequence extends PetSequence {
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>() {
			private int index =0 ;
			@Override
			public boolean hasNext() {
				return index<pets.length;
			}

			@Override
			public Pet next() {
				return pets[index++];
			}
			@Override
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		NonConllectionSequence nc = new NonConllectionSequence();
		InterfaceVsIterator.disPlay(nc.iterator());
		String[] strings = "afda dfkajh afda afa".split(" ");
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
class PetSequence {
	private List<Pet> petList = Pet.arrayList(8);
	Pet[] pets = petList.toArray(new Pet[0]);
}

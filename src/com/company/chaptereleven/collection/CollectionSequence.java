package com.company.chaptereleven.collection;

import com.company.vo.Pet;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/**
 * @author czy
 * @date 2020-9-25
 */
public class CollectionSequence extends AbstractCollection<Pet> {
    private List<Pet> petList = Pet.arrayList(8);
    Pet[] pets = petList.toArray(new Pet[0]);

    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
/*
			@Override
			public void remove(){
				throw new UnsupportedOperationException();
			}*/
        };
    }

    public static void main(String[] args) {
        CollectionSequence pets = new CollectionSequence();
        InterfaceVsIterator.disPlay(pets);
        InterfaceVsIterator.disPlay(pets.iterator());
    }

}


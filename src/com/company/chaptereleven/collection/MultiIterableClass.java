package com.company.chaptereleven.collection;

import java.util.*;

/**
 * @author czy
 * @date 2020-9-27
 */
public class MultiIterableClass extends IterableClass {
	public Iterable<String> reversed(){
		return new Iterable<String>(){
			@Override
			public Iterator<String> iterator(){
				return new Iterator<String>(){
					int current = words.length - 1;

					@Override
					public boolean hasNext() {
						return current >-1;
					}
					@Override
					public String next(){
						return words[current--];
					}
					public void remore(){
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	public Iterable<String> randomized(){
		return new Iterable<String>() {
			@Override
			public Iterator<String> iterator() {
				List<String> shuffled =
						new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}

	public static void main(String[] args) {
		MultiIterableClass mic = new MultiIterableClass();
		for (String s : mic.reversed()) {
			System.out.println(s + " ");
		}
		System.out.println("--------");
		for (String s : mic.randomized()) {
			System.out.println(s + " ");
		}
		System.out.println("--------");
		for (String s : mic) {
			System.out.println(s + "");
		}
	}
}

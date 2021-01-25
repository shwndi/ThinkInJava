package com.company.chapterfifteen.drinks;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * 咖啡类生成器
 *
 * @author czy
 * @date 2021-1-4
 */
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee>{

	private Class[] types = {
			Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class
	};
	private static Random rand = new Random(47);
	public CoffeeGenerator(){}
	public int size = 0;
	public  CoffeeGenerator(int sz){
		size = sz;
	}
	@Override
    public Coffee next(){
		try{
			return (Coffee)types[rand.nextInt(types.length)].newInstance();
		}catch (Exception e){
			throw new RuntimeException();
		}
	}

	class CoffeeIterator implements Iterator<Coffee>{
		int count = size;
		@Override
		public boolean hasNext(){
			return count > 0;
		}
		@Override
		public Coffee next(){
			count--;
			return CoffeeGenerator.this.next();
		}
		@Override
		public void remove(){
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}

	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		/**
		 * 没有创建coffee类
		 */
		CoffeeGenerator coffees = new CoffeeGenerator(5);

		for (int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}
		for (Coffee coffee : new CoffeeGenerator(5)) {
			System.out.println(coffee);
		}

		for (Iterator<Coffee> iter = coffees.iterator(); iter.hasNext(); ) {
			Coffee coffee = iter.next();
		}
	}
}

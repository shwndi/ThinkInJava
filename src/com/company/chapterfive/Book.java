package com.company.chapterfive;

/**
 * @author czy
 * @date 2020-7-10
 */
public class Book {
	boolean checOut = false;
	Book(boolean checOut){
		this.checOut=checOut;
		System.out.println(this);
	}
	void checkIn(){
		this.checOut=false;
	}
	@Override
	protected void finalize(){
		if (checOut){
			System.out.println("Error:checked out"+"\t"+this.getClass()+"\t"+this);
		}
	}

	public static void main(String[] args) {
		Book book1 = new Book(true);
		book1.checkIn();
		Book book2 = new Book(true);
		book2.checkIn();
		new Book(true);
		new Book(true);
		System.gc();
	}
}

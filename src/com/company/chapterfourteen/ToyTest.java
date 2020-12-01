package com.company.chapterfourteen;

/**
 * @author czy
 * @date 2020-10-26
 */
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
class Toy {
	Toy() {}
	Toy(int i){}
}
class FancyToy extends Toy implements  HasBatteries,Waterproof,Shoots{
	FancyToy(){
		super();
	}
}
public class ToyTest {
	static void printInfo(Class cc){
		System.out.println("Class name:"+cc.getName()+"is interface? ["+cc.isInterface()+"]");
		System.out.println("simple name:"+cc.getSimpleName());
		System.out.println("Canonical name:"+cc.getCanonicalName());
	}
	public static void main(String[] args){
		Class c =null;
		try {
			c = Class.forName("com.company.chapterfourteen.FancyToy");
		}catch(ClassNotFoundException e){
			System.out.println("Can`t not find FancyToy");
			System.exit(1);
		}
		Class<Double> type = Double.TYPE;
		System.out.println(type.toString());
		printInfo(c);
		for (Class anInterface : c.getInterfaces()) {
			printInfo(anInterface);
		}
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch (InstantiationException e) {
			System.out.println("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}

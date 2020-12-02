package com.company.chapterfourteen;

/**
 * @author czy
 * @date 2020-12-2
 */
public class GenericToyTest {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		Class<FancyToy> ftClass = FancyToy.class;
		FancyToy fancyToy = ftClass.newInstance();
		/**
		 * 如果获取的是超类，那么编译器只允许你声明的超类引用为“某个类，他是FancyToy的超类”而不会直接
		 * 将超类声明。
		 * getSuperClass()方法返回的是基类（不是接口），编译器在编译期就知道它是什么类，还知道它是
		 * 谁（谁通过方法找的它）的超类，正是由于这种含糊其辞，超类使用newInstance（）方法返回的不是精确类型
		 * 而是Object
		 */
		Class<? super FancyToy> superclass = ftClass.getSuperclass();
		//Class<Toy> superclass1 = ftClass.getSuperclass();
		Object object = superclass.newInstance();
	}
}

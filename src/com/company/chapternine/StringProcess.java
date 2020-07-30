package com.company.chapternine;

import java.util.Arrays;

/**
 * @author czy
 * @date 2020-7-25
 */
public abstract class StringProcess implements InterfaceProcessor {
	public String name(){
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);
	public static String s = "If she weights the same as a duck,she`s made a wood";

	public static void main(String[] args) {
		Apply2.process(new StringUpCase(), s);
		Apply2.process(new StringDownCase(), s);
		Apply2.process(new StringSplitCase(), s);
	}
}
class Apply2 {
	public static void process(InterfaceProcessor p, Object s) {
		System.out.println("UserProcessor" + p.name());
		System.out.println(p.process(s));
	}
}
class StringUpCase extends StringProcess {
	@Override
	public String process(Object input) {
		return ((String) input).toUpperCase();
	}

}

class StringDownCase extends StringProcess {
	@Override
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class StringSplitCase extends StringProcess {
	@Override
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}
package com.company.chapterfive;

/**
 * 链式加载实现
 *
 * @author czy
 * @date 2020-7-9
 */
public class Dog {
	private String name;
	private String colour;

	public String getName() {
		return name;
	}

	public Dog setName(String name) {
		this.name = name;
		return this;
	}

	public String getColour() {
		return colour;
	}

	public Dog setColour(String colour) {
		this.colour = colour;
		return this;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				", colour='" + colour + '\'' +
				'}';
	}

}

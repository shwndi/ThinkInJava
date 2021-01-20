package com.company.chapterfourteen.robot.instance;

import com.company.chapterfourteen.robot.Operation;
import com.company.chapterfourteen.robot.Robot;

import java.util.Arrays;
import java.util.List;

/**
 * @author czy
 * @date 2020-12-30
 */
public class SnowRomovalRobot implements Robot {
	private String name;

	public SnowRomovalRobot(String name) {
		this.name = name;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public String model() {
		return "SnowBot series 11";
	}

	@Override
	public List<Operation> operations() {
		return Arrays.asList(
				new Operation() {
					@Override
					public String description() {
						return name + " can shovel snow";
					}

					@Override
					public void command() {
						System.out.println(name + " shoveling snow");
					}
				},
				new Operation() {
					@Override
					public String description() {
						return name + " can chip ice";
					}

					@Override
					public void command() {
						System.out.println(name + " chip ice");
					}
				},
				new Operation() {
					@Override
					public String description() {
						return name + " can clear roof";
					}

					@Override
					public void command() {
						System.out.println(name + " cleat roof");
					}
				}
		);
	}

	public static void main(String[] args) {
		Test.test(new SnowRomovalRobot("Slusher"));
	}
}

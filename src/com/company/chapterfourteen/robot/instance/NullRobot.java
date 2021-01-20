package com.company.chapterfourteen.robot.instance;

import com.company.chapterfourteen.robot.Null;
import com.company.chapterfourteen.robot.Operation;
import com.company.chapterfourteen.robot.Robot;

import java.lang.reflect.*;
import java.util.Collections;
import java.util.List;

/**
 * @author czy
 * @date 2020-12-31
 */
class NullRobotProxyHandler implements InvocationHandler {
	private String nullName;
	private Robot proxide = new NRobot();

	NullRobotProxyHandler(Class<? extends Robot> type) {
		nullName = type.getSimpleName() + " NullRobot";
	}


	public class NRobot implements Null, Robot {

		@Override
		public String name() {
			return nullName;
		}

		@Override
		public String model() {
			return nullName;
		}

		@Override
		public List<Operation> operations() {
			return Collections.emptyList();
		}
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(proxide, args);
	}
}

public class NullRobot {
	public static Robot newNullRobot(Class<? extends Robot> type) {
		return (Robot) Proxy.newProxyInstance(Robot.class.getClassLoader(),
				new Class[]{Null.class, Robot.class},
				new NullRobotProxyHandler(type));
	}

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
//		NullRobotProxyHandler nullRobotProxyHandler = new NullRobotProxyHandler(SnowRomovalRobot.class);
//		Class<?> proxyClass = Proxy.getProxyClass(Robot.class.getClassLoader(), new Class[]{Null.class, Robot.class});
//		Constructor<?> snow_bee = proxyClass.getConstructors(NullRobotProxyHandler.class);
//		Robot instance = (Robot) snow_bee.newInstance(nullRobotProxyHandler);
//		System.out.println(instance);
		Robot[] robots = {new SnowRomovalRobot("snow bee"),
				newNullRobot(SnowRomovalRobot.class)};
		for (Robot robot : robots) {
			Robot.Test.test(robot);
		}
	}
}

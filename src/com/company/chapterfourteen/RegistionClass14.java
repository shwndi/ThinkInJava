package com.company.chapterfourteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author czy
 * @date 2020-12-10
 */
class Part2{
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
	static List<Class<? extends Part2>> partClass = 
			new ArrayList<>();
	static{
		partClass.add(FuelFilter2.class);
		partClass.add(AirFilter2.class);
		partClass.add(CabinAirFilter2.class);
		partClass.add(OilFilter2.class);
		partClass.add(FanBelt2.class);
		partClass.add(PowerSteeringBelt2.class);
		partClass.add(GeneratorBelt2.class);
	}
	private static Random random = new Random();
	public static Part2 createRandom(){
		int n = random.nextInt(partClass.size());
		try {
			return partClass.get(n).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}

class Filter2 extends Part2 {}

class FuelFilter2 extends Filter2 {
	// Create a Class Factory for each specific type:
	public static class Factory implements com.company.chapterfourteen.Factory<FuelFilter2> {
		@Override
		public FuelFilter2 create() { return new FuelFilter2(); }
	}
}
class AirFilter2 extends Filter2 {
	public static class Factory implements com.company.chapterfourteen.Factory<AirFilter2> {
		@Override
		public AirFilter2 create() { return new AirFilter2(); }
	}
}

class CabinAirFilter2 extends Filter2 {
	public static class Factory implements com.company.chapterfourteen.Factory<CabinAirFilter2> {
		@Override
		public CabinAirFilter2 create() { return new CabinAirFilter2(); }
	}
}

class OilFilter2 extends Filter2 {
	public static class Factory implements com.company.chapterfourteen.Factory<OilFilter2> {
		@Override
		public OilFilter2 create() { return new OilFilter2(); }
	}
}

class Belt2 extends Part2 {}

class FanBelt2 extends Belt2 {
	public static class Factory implements com.company.chapterfourteen.Factory<FanBelt2> {
		@Override
		public FanBelt2 create() { return new FanBelt2(); }
	}
}

class GeneratorBelt2 extends Belt2 {
	public static class Factory implements com.company.chapterfourteen.Factory<GeneratorBelt2> {
		@Override
		public GeneratorBelt2 create() { return new GeneratorBelt2(); }
	}
}

class PowerSteeringBelt2 extends Belt2 {
	public static class Factory implements com.company.chapterfourteen.Factory<PowerSteeringBelt2> {
		@Override
		public PowerSteeringBelt2 create() { return new PowerSteeringBelt2(); }
	}
}



public class RegistionClass14 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Part2.createRandom());
		}
	}
	
}

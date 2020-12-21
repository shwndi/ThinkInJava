package com.company.chapterfourteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author czy
 * @date 2020-12-7
 */
class Part {
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

	static List<Factory<? extends Part>> partFactories =
			new ArrayList<>();
	static {
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
		partFactories.add(new PowerStringBelt.Factory());
	}
	private static Random rand =new Random(47);
	public static Part createRandom(){
		int i = rand.nextInt(partFactories.size());
		return partFactories.get(i).create();
	}
}
class Filter extends Part{}

class FuelFilter extends Filter{
	public static class Factory
			implements com.company.chapterfourteen.Factory<FuelFilter>{
		@Override
		public FuelFilter create(){
			return new FuelFilter();
		}

	}
}

class AirFilter extends Filter{
	public static class Factory
			implements com.company.chapterfourteen.Factory<AirFilter>{
		@Override
		public AirFilter create(){
			return new AirFilter();
		}
	}
}

class CabinAirFilter extends Filter{
	public static class Factory
			implements com.company.chapterfourteen.Factory<CabinAirFilter>{
		@Override
		public CabinAirFilter create(){
			return new CabinAirFilter();
		}
	}
}

class OilFilter extends Filter{
	public static class Factory
			implements com.company.chapterfourteen.Factory<OilFilter>{
		@Override
		public OilFilter create(){
			return new OilFilter();
		}
	}
}

class Belt extends Part{}

class FanBelt extends Belt{
	public static class Factory
			implements com.company.chapterfourteen.Factory<FanBelt>{
		@Override
		public FanBelt create() {
			return new FanBelt();
		}
	}
}
class GeneratorBelt extends Belt{
	public static class Factory
	implements com.company.chapterfourteen.Factory<GeneratorBelt>{

		@Override
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}
	}
}

class PowerStringBelt extends Belt{
	public static class Factory
	implements com.company.chapterfourteen.Factory<PowerStringBelt>{

		@Override
		public PowerStringBelt create() {
			return new PowerStringBelt();
		}
	}
}
public class RergisteredFactory {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Part.createRandom());
		}
	}
}

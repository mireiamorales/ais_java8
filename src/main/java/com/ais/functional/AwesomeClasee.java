package com.ais.functional;

import java.util.function.Function;

public class AwesomeClasee {

	//private static Integer invert(Integer value)
	//{
		//return -value;
	//}
	
	public static Integer invertTheNumber(){
		Integer toInvert = 5;
		
		//Function<Integer, Integer> invertfunction = AwesomeClasee::invert;
		//return compute(invertfunction, toInvert);
		
		return compute(value -> -value, toInvert);
	}
	
	public static Integer compute (Function<Integer, Integer> function, Integer value)
	{
		return function.apply(value);
	}

	
}

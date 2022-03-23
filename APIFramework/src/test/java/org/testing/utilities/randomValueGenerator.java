package org.testing.utilities;

import java.util.Random;

public class randomValueGenerator {
	
	public static String generateRandomValue() {
		Random r=new  Random();
		Integer i=r.nextInt();
		return i.toString();
	}

}

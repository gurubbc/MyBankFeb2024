package com.ofss.util;

import java.util.Random;

public class MyUtility {
	
	public static int getRandomNumber() {
		Random r=new Random();
		return r.nextInt(999);
	}

}

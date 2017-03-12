package com.test.untils;

import java.util.concurrent.ThreadLocalRandom;

public class Number {
 public static int getRandom(){
	 ThreadLocalRandom tlr = ThreadLocalRandom.current();
	 return tlr.nextInt(100);
 }
}

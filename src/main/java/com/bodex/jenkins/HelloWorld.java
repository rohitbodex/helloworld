package com.bodex.jenkins;

public class HelloWorld {

//	public static void main(String[] args) {
//		
//		HelloWorld hw = new HelloWorld();
//		System.out.println(hw.factorial(7));
//
//	}
//	
	public  int factorial(int factOf) {
		
		int result=1;
		
		for(int i=1;i<=factOf;i++) {
		result= result*i;	
		}
		
		return result;
	}

}

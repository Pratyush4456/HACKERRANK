package com.vp;
public class PrimeLambda {

	public static void main(String[] args) {

	Even prime = (int a) -> {
		for (int i = 2; i <=Math.sqrt(a); i++) {
			   if(a%i==0) {
				   System.out.println("false");
			  }
			   else {
		  System.out.println("true");
			   }
		}
	};
	 prime.check(121);
	 prime.check(1919);
}
}

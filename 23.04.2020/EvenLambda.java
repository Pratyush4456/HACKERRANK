package com.vp;

public class EvenLambda {
	
	public static void main(String[] args) {
	
	Even even = (int a) -> {
		if(a%2==0){
			System.out.println("Number "+a+" is even.");
		}else{
			System.out.println("Number "+a+" is odd.");
		}
	};
	even.check(5);
	even.check(8);
}
}

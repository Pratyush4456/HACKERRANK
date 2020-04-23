package com.vp;
public class ReverseString {

		public static void main(String[] args) {
		
		String s1= "java class";
		String s2= "cognizant training";
		
		Reverse rev=(s) -> {
			
			
			String temp ="";
			for(int i = s.length()-1;i>=0;i--) {

				temp+=s.charAt(i);
				}
		return temp;
		};
	System.out.println(rev.reversestring(s1));
  System.out.println(rev.reversestring(s2));
}
}

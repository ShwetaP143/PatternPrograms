package com.Testingshastra;

public class PatternABCD1 {
	public static void main(String[] args) {
		 int x = 65;
 for(int i=1 ; i<=6; i++) {
	 for(int s=i ; s<6 ; s++) {
		 System.out.print(" ");
	 }
	 for(int j=0 ; j<= 2*i - 2 ;j++ ) {
		 
		 System.out.print((char)(x+j));
	 }
	 System.out.println();
 }
 }
}

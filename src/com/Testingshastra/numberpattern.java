package com.Testingshastra;

public class numberpattern {

	public static void main(String[] args) {
		
		int x = 1;
		
		for(int i=1; i<=4 ; i++) {
			
			for(int s=4 ; s>=i ;s--) {
			 System.out.print(" ");
			}
			
		for(int j=0 ; j<i ; j++) {
			System.out.print(x+j +" ");
		}
		System.out.println();
	}

}
}
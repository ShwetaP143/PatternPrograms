package com.Testingshastra;

public class Number1pattern {
	public static void main(String[] args) {
		   int x=1;
		for(int i=1 ; i<=4 ; i++){
			for(int s=4 ; s>=i ; s--) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=i ; j++) {
				System.out.print(x++ +" ");
			}
			System.out.println();
		}

	}

}

package com.Testingshastra;

public class PatternABCD4 {

	public static void main(String[] args) {
		for(int i=1 ; i<=4 ; i++) {
			int x = 65;
			for(int s=i ; s<=3 ; s++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<=2*i - 2 ; j++) {
				
				System.out.print((char)(x+j));
			}
			System.out.println();
		}
		for(int i=1 ; i<=3; i++) {
			int x = 65;
			for(int s=3 ; s>i ; s--){
				System.out.print(" ");
			}
			for(int j=1 ; j<=7 ; j++) {
				if(i==1 && j==4 || i==1 && j==5 || i==1 && j==6 || i==1 && j==7)
					System.out.print("");
				else if(i==2 && j==6 || i==2 && j==7)
					System.out.print("");
				else
				System.out.print((char)x++);
			}
			System.out.println();
		}

	}

}

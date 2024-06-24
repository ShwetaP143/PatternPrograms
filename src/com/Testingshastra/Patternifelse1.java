package com.Testingshastra;

public class Patternifelse1 {

	public static void main(String[] args) {
		int x=97;
		int y=1;
		
		for(int i=1 ; i<=4 ; i++) {
			for(int s=4; s>=i ; s--) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=i ; j++) {
				if(i==3 && j==2) {
					System.out.print(y+" ");
					x++;
				}else if(i==4 && j==2) {
					System.out.print((++y)+" ");
					x++;
				}else if(i==4 && j==3) {
					System.out.print((++y)+" ");
					x++;
				}else
				System.out.print((char)(x++)+" ");
			}
			System.out.println();
		}
	}

}

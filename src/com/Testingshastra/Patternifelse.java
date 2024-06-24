package com.Testingshastra;

public class Patternifelse {

	public static void main(String[] args) {
	       
		int x=97;
	       
		for(int line=1 ; line<=5 ; line++) {
			for(int space=5 ; space>=line ; space--) {
				System.out.print(" ");
			}
			for(int ast=1 ; ast<=line ; ast++) {
				if(line==3 && ast==2 ) {
					System.out.print("* ");
					x++;
				}else if(line==4 && ast==2 || line==4 && ast==3 ) {
					System.out.print("* ");
					x++;
				} else if(line==5 && ast==2 || line==5 && ast==3 || line==5 && ast==4) {
					System.out.print("* ");
					x++;
				}else
				System.out.print((char)(x++) +" ");
			}
			System.out.println();
		}
	}

}

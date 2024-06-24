package com.Testingshastra;

public class Pyramidmethod {
	public void Pyramid(int num) {

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

package com.Testingshastra;

import java.util.Scanner;

public class Pyramidm {

	public static void main(String[] args) {
		System.out.println("Enter size to print pyramid : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		Pyramidmethod m =new Pyramidmethod();
		m.Pyramid(size);
	}
}

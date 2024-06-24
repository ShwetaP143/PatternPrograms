package com.Testingshastra;

public class PatternABCD2 {
 public static void main(String[] args) { 
	 for(int i=1 ; i<=6 ; i++) {
		 int x = 65;
		 
		 for(int j=1 ; j<=11 ; j++) {
			 if(i==1 || i==6)
		      System.out.print((char)x++);
			 
			 else if(i==2 && j==1 || i==3 && j==1|| i==4 && j==1 || i==5 && j==1)
				System.out.print((char)x);
			 
			 else if(i==2 && j==11 || i==3 && j==11|| i==4 && j==11 || i==5 && j==11)
				System.out.print((char)(x+1));
			  else
				  System.out.print(" ");
			 
		 }
		 System.out.println();
	 }
}
}

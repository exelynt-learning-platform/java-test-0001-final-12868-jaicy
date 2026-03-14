package com.demo.patterns;

public class Pattern {
	
	

	public static void main(String[] args) {
		  pattern1(5);

	}
	
   public static void pattern1(int n) {
	   
		    int totalRows = 2 * n - 1;

		    for (int i = 1; i <= totalRows; i++) {

		        int space = i <= n ? n - i : i - n;

		        // left spaces
		        for (int j = 1; j <= space; j++) {
		            System.out.print(" ");
		        }

		        // first star
		        System.out.print("*");

		        // middle rows print second star
		        if (i != 1 && i != totalRows) {

		            int innerSpace = (n - space) * 2 - 3;

		            for (int j = 1; j <= innerSpace; j++) {
		                System.out.print(" ");
		            }

		            System.out.print("*");
		        }

		        System.out.println();
		    }
		
		
	}

}

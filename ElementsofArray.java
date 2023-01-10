package com.bridgrlabz.arrayproblems;

import java.util.Scanner;

public class ElementsofArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Size : ");
		int size = scan.nextInt();
		System.out.println("Enter the Numbers ");
		int[] num = new int[size];
		
		for(int i=0; i<size; i++) {
			num[i] = scan.nextInt();
		}
		System.out.println("Elements of Array !!!");
		for(int j=0; j<size; j++) {
			System.out.print(num[j]+" ");
		}
	}
}

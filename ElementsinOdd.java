package com.bridgrlabz.arrayproblems;

import java.util.Scanner;

public class ElementsinOdd {
	
	static void OddPosition(int [] numbers, int size) {
		System.out.println("Elements in Odd Position : ");
		for(int i=0; i<size; i++) {
			if(numbers[i]%2 == 1) 
				System.out.print(numbers[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Size of an Array : ");
		int size = scan.nextInt();
		int [] numbers = new int[size];
		System.out.println("Enter the Numbers : ");
		
		for(int i=0; i<size; i++) {
			numbers[i] = scan.nextInt();
		}
		System.out.println("Elements of the Array :");
		for(int j=0; j<size; j++) {
			System.out.print(numbers[j]+" ");
		}
		System.out.println();
		OddPosition(numbers, size);
	}
}

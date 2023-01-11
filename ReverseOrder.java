package com.bridgrlabz.arrayproblems;

import java.util.Scanner;

public class ReverseOrder {

	static void Reverse(int [] numbers, int size) {
		System.out.println("Reversed Array Elements : ");
		for(int i=numbers.length-1; i>=0; i--) {
			System.out.print(numbers[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size = scan.nextInt();
		int [] numbers = new int[size];
		System.out.println("Enter the Numbers : ");
		
		for(int i=0; i<size; i++) {
			numbers[i] = scan.nextInt();
		}
		System.out.println("Elements of the Array : ");
		for(int j=0; j<size; j++) {
			System.out.println(numbers[j]);
		}
		System.out.println();
		Reverse(numbers, size);
	}
}

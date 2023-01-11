package com.bridgrlabz.arrayproblems;

import java.util.Scanner;

public class DuplicateElements {
	static void Duplicate(int [] numbers, int size) {
		System.out.println("Duplicate Array Elements : ");
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(numbers[i] == numbers[j])
				System.out.println(numbers[j]);
			}
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
			System.out.print(numbers[j]+" ");
		}
		System.out.println();
		Duplicate(numbers, size);
	}
}
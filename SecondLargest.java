package com.bridgrlabz.arrayproblems;

import java.util.Scanner;

public class SecondLargest {
	
	static void Largest(int [] numbers, int size) {
		int temp = numbers[0];
		int secondLargest = numbers[0];
		for(int i=0; i<size; i++) {
			if(numbers[i] > temp) {
				secondLargest = temp;
				 temp = numbers[i];
				}
			else if(numbers[i] > secondLargest)
				secondLargest = numbers[i];
			}
		System.out.println("Second Largest Array Element : "+secondLargest);
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
		Largest(numbers, size);
	}
}

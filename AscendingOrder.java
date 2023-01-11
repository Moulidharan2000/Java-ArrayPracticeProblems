package com.bridgrlabz.arrayproblems;

import java.util.Scanner;

public class AscendingOrder {
	
	static void Sort(int [] numbers, int size) {
		int temp = 0;
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println("Array Elements in Ascrending Order : ");
		for(int i=0; i<size; i++) {
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
			System.out.print(numbers[j]+" ");
		}
		System.out.println();
		Sort(numbers, size);
	}
}

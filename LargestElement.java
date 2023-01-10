package com.bridgrlabz.arrayproblems;

import java.util.Scanner;

public class LargestElement {
	
	static void Largest(int[] num, int size) {
		int large = num[0];
		for(int i=0; i<size; i++) {
				if(num[i] > large)
					large = num[i];
		}
		System.out.println(large+" is the Largest Element");
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size = scan.nextInt();
		int [] num = new int[size];
		System.out.println("Enter the Numbers : ");
		
		for(int i=0; i<size; i++) {
			num[i] = scan.nextInt();
		}
		System.out.println("Elements of Array :");
		for(int j=0; j<size; j++) {
			System.out.print(num[j]+" ");
		}
		System.out.println();
		Largest(num, size);
	}
}

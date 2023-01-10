package com.bridgrlabz.arrayproblems;

import java.util.Scanner;

public class FrequencyofElements {
	
	static void Frequency(int [] num, int size) {
		int [] freq = new int[size];
		int visited = -1;
		
		for(int i=0; i<size; i++) {
			int count = 1;
			for(int j=i+1; j<size; j++) {
				if(num[i]==num[j]) {
					count++;
					freq[j] = visited;
				}
			}
			if(freq[i] != visited)
				freq[i] = count;
		}
		System.out.println("Frequency of the Elements : ");
		for(int i=0; i<freq.length; i++) {
			if(freq[i] != visited)
				System.out.println(num[i]+" | "+freq[i]);
		}
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
		Frequency(num, size);
	}
}

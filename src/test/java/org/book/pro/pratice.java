package org.book.pro;

import java.util.Iterator;
import java.util.Scanner;

public class pratice {

	public static void main(String[] args) {
		int temp;

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int n = s.nextInt();
		int a[] = new int[n];

		System.out.println("Enter all the number");

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();

		}

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}

		for (int i=0;i<n-1;i++) {
			
			System.out.println(a[i]+",");
		}	System.out.println(a[n-1]);}
	

}

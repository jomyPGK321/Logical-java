package Presentation;

import java.util.Scanner;

public class Add_metrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the index");
		int size = s.nextInt();
		int size1 = s.nextInt();
		System.out.println("Enter the first array");
		int[] values = new int[size];
		for (int i = 0; i < size; i++) {
			values[i] = s.nextInt();
		}
		System.out.println("Enter the second array");
		int[] value = new int[size1];
		for (int i = 0; i < size; i++) {
			value[i] = s.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.println(values[i] + value[i]);
		}
	}
}

package Presentation;

import java.util.Scanner;

public class sum_febinoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n = s.nextInt();
		int a = 0, b = 1, c, i;
		System.out.println(a);
		System.out.println(b);
		for (i = 2; i < n; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

}

package Presentation;

import java.util.Scanner;

public class rev_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		System.out.println("Reversed Number: " + rev);
	}

}

package first_pattern;

import java.util.Scanner;

public class Alpha_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i, j, k;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (k = i; k < n; k++) {
				System.out.println(" ");
			}
			for (j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
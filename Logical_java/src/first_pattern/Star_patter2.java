package first_pattern;

import java.util.Scanner;

public class Star_patter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i, j;
		for (i = 0; i <n; i++) {
			for (j = 0; j < n; j++) {
				{
				if (i == j||(i+j)==(n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("0 ");
				}}
			}
			System.out.println();
		}
	}
}

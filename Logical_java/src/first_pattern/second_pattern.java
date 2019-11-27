package first_pattern;

import java.util.Scanner;

public class second_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		for(int i=number-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}

package first_pattern;

import java.util.Scanner;

public class pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		//this for loop contains the rows of pattern
		for(int i=0;i<number;i++)
		{
			//this for loop contains the coloum of the pattern
			for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
			System.out.println();
		}
	}
}

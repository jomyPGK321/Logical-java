package first_pattern;

import java.util.Scanner;

public class star_pattern1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i, j, k;
		for(i=1;i<=3;i++)
		{
		for(j=i;j<3;j++)
		{
		System.out.print(" ");
		}
		for(k=1;k<(i*2);k++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		for(i=2;i>=1;i--)
		{
		for(j=n;j>i;j--)
		{
		System.out.print(" ");
		}
		for(k=1;k<(i*2);k++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		}
	}
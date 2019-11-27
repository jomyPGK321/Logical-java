package first_pattern;

import java.util.Scanner;

public class third_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int j,i;
		for(i=0;i<num;i++)
		{
		for(j=num-i;j>1;j--)
		{
		System.out.print(" ");	
		}
		for(j=0;j<=i;j++)
		{
		System.out.print("* ");
	}
		System.out.println(" ");
	}
}}

package first_pattern;

import java.util.Scanner;

public class Pattern_csk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j;
for(i=0;i<n;i++)
{
	for(j=0;j<=i;j++)
	{
		System.out.print("c");	
	}
	for(int p=0;p<=i;p++)
	{
		System.out.print("s");
	}
	for(int k=0;k<=i;k++)
	{
		System.out.print("k");
	}
	System.out.println();
}
	}

}
 
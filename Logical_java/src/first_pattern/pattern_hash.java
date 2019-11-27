package first_pattern;

import java.util.Scanner;

public class pattern_hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<2*n+1;j++)
			{
				if(i+j==n||j-i==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("# ");	
				}
				
			}
			System.out.println();
		}
	}

}

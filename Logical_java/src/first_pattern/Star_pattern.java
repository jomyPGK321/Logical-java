package first_pattern;

import java.util.Scanner;

public class Star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=(2*i)+1;j++)
			{
				if(j==(i+1)) {
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			
			}
			System.out.println();
		}
		
	}

}

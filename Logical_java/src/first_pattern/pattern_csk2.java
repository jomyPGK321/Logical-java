package first_pattern;

import java.util.Scanner;

public class pattern_csk2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);// TODO Auto-generated method stub
		int n = s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0||i==1)
				{
				System.out.print("c");
				}
				if(i==4||i==5)
				{
					if(i==1&&(j==2||j==3))
					{
						System.out.print("s");
					}
					System.out.print("k");	
				}
				if(i==2||i==3)
				{
					if(i==4&&(j==2||j==3))
					{
						System.out.print("s");
					}
					System.out.print("s");
				}
				
				
			}
			System.out.println();
		}
	}

}

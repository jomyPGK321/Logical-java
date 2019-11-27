package first_pattern;

import java.util.Scanner;

public class num_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j;
for(i=1;i<=n;i++)
{
	for(j=1;j<=n;j++)
	{
		if(i==j)
		{
			System.out.print("0");
		}
		else
		{
			System.out.print(i);
		}
	}
	System.out.println("");
	}
	}

}

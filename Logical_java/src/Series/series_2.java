package Series;

import java.util.Scanner;

public class series_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=11;int b=0;
		for(int i=0;i<n;i++)
		{
			b=a*a;
			System.out.printf("%d ",b);
			a=a+4;
		}
	}

}

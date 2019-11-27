package Series;

import java.util.Scanner;

public class Series_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;
		for(int i=1;i<=n;i++)
			{
			if(i%2!=0)
			{
				a=(i*i)-1;
			}
			else
			{
				a=(i*i)-2;
			}
			System.out.printf("%d ",a);
			}
			}

}

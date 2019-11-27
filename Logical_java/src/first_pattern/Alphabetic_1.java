 package first_pattern;

import java.util.Scanner;

public class Alphabetic_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,j;
		 int n=s.nextInt();
		 
		     for(i=1;i<=n;i++)
		     {
		         for(j=1;j<=i;j++)
		         {
		             System.out.printf("%c ",i+64);
		         }
		 
		         System.out.println("");
		     }
	}

}

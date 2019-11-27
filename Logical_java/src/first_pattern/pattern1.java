package first_pattern;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String n = s.next();
		int i, j;
		for(i=0;i<n.length();i++)
	     {
	         for(j=0;j<=i;j++)
	         {
	             System.out.print(n.charAt(j));
	         } 
	         System.out.println("");
	     }
	 }
	}
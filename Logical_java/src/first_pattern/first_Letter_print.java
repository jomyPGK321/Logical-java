package first_pattern;

import java.util.Scanner;

public class first_Letter_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String n=s.next();
int l=n.length();
int h=l*6;
for(int i=0;i<=h;i++)
{
	for(int j=l;j<=h;j++)
	{
		System.out.print("* ");
	}
	System.out.println();
}


	}

}

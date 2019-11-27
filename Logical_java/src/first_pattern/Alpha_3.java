package first_pattern;

import java.util.Scanner;

public class Alpha_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j;
for(i=n;i>=1;i--)
{
    for(j=i;j>=1;j--)
    { 
        System.out.printf("%c ",j+64);
    } 
    System.out.println("");
}
	}

}

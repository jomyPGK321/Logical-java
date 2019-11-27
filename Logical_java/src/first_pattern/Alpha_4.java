package first_pattern;

import java.util.Scanner;

public class Alpha_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j;
int k=1;
for(i=1;i<=n;i++)
{
   for(j=1;j<=i;j++,k++)
    {
        System.out.printf("%4c",(char)(k+64));
    }

    System.out.println("");
}
	}

}

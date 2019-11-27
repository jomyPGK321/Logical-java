package paliumdrom;
import java.util.*;
public class pali1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r,sum=0,num=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==num)
		{
			System.out.println("Paliumdrom");
		}
		else
		{
			System.out.println("Not Paliumdrom");
		}
}}

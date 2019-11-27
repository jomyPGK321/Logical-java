package paliumdrom;
import java.util.Scanner;
public class pali2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			String str,rev = "";
			System.out.println("Enter the string:");
			   str=s.next();

			int length=str.length();
			int i;
			for(i=length-1;i>=0;i--)

			rev=rev+str.charAt(i);

			if(str.contentEquals(rev))
			{
			System.out.println("It is a Palindrome");
			}
			else
			{
			System.out.println("It is not a Palindrome");
			}
	}

}

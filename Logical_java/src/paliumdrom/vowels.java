package paliumdrom;
import java.util.Scanner;
public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i=0;
		char c;
		int d=0;
		String A=s.next();
		for (i = 0; i<A.length(); i++)
		{
		c=A.charAt(i);
		if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
		{
			d++;
			System.out.print("$");
		}
		else
		{
			System.out.print(c);
		}
		}
		
		
	}

}

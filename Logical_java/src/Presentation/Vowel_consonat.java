package Presentation;

import java.util.Scanner;

public class Vowel_consonat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the Charecter");
char c=s.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
	System.out.println("Charector is a Vowel");
}
else
{
	System.out.println("Charector is Consonat");
}
	}

}

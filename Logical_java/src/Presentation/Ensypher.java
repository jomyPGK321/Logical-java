package Presentation;

import java.util.Scanner;

public class Ensypher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character");
		char c=s.next().charAt(0);
		System.out.println("Enter the key");
		int key=s.nextInt();
		int a=(int)c;
		int b=key+a;
		        System.out.println((char)b);
	}

}

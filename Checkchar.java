/*
11. Write a program to check whether a entered character is lowercase (a to z) or uppercase (A to Z).
*/

class Checkchar{
	public static void main(String[] args){
		char ch;
		System.out.print("Enter a character : ");
		ch=new java.util.Scanner(System.in).next().charAt(0);
		if(ch>=65 && ch<=90)
			System.out.print("uppercase");
		else if(ch>=97 && ch<=122)
			System.out.print("lowercase");
		else
			System.out.print("Not alaplabe");
	}
}
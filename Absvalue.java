/*
7. Write a program to print absolute value of a number entered by user. 
   E.g.-
	INPUT: 1
	OUTPUT: 1
	INPUT: -1
	OUTPUT: 1
*/

class Absvalue{
	public static void main(String ... a){
		int num;
		System.out.print("Enter a Number : ");
		num=new java.util.Scanner(System.in).nextInt();
		if(num<0)
			System.out.println("Absolute value : "+(-num));
		else
			System.out.println("Absolute value : "+num);
	}
}
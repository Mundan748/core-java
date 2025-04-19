/*
5. Two numbers are entered through the keyboard. Write a program to find the value of one 
   number raised to the power of another. (Do not use Java built-in method)
*/

class Power{
	public static void main(String[] args){
		int num,pow,power=1;
		System.out.print("Enter a number : ");
		num= new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter power : ");
		pow= new java.util.Scanner(System.in).nextInt();
		for(int i=1;i<=pow;i++)
			power*=num;
		System.out.print(num+"^"+pow+" = "+power);
	}
}
/*
6. Write a program that prompts the user to input an integer and then outputs the number
   with the digits reversed. For example, if the input is 12345, the output should be 54321.
*/

class Reverseint{
	public static void main(String[] args){
		int num,rem,newnum=0;
		System.out.print("Enter a number : ");
		num= new java.util.Scanner(System.in).nextInt();
		while(num>0 || -num>0){
			rem=num%10;
			num=num/10;
			newnum= newnum*10+rem;
		}
		System.out.print("reversed no. is : "+newnum);
	}
}
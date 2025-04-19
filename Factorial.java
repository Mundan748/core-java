/*
4. Write a program to find the factorial value of any number entered through the keyboard.
*/

class Factorial{
	public static void main(String[] args){
		int num;
		long fact=1;
		System.out.print("Enter a +ve number : ");
		num= new java.util.Scanner(System.in).nextInt();
		if(num<0) System.out.println("Invalid no");
		else{
			for(int i=1;i<=num;i++)
				fact*=i;
				
			System.out.println("factorial value : "+fact);
		}
	}
}
/*
8. Write a program that prompts the user to input a positive integer. It should then output 
   a message indicating whether the number is a prime number.
*/


class Prime{
	public static void main(String[] args){
		int num;
		boolean flag=true;
		System.out.print("Enter a +ve number : ");
		num= new java.util.Scanner(System.in).nextInt();
		for(int i=2;i<=num-1;i++){
			if(num%i==0){
				flag=false;
				System.out.println("It is not Prime no.");
				break;
			}
		}
		if(flag)
			System.out.println("It is Prime no.");
	}
}
/*
9. Write a program to calculate HCF of Two given number.
*/

class Hcf{
	public static void main(String[] args){
		int num1,num2,hcf=1;
		System.out.print("Enter number1: ");
		num1= new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter number2: ");
		num2= new java.util.Scanner(System.in).nextInt();
		int min=num1<num2?num1:num2;
		for(int i=2;i<=min;i++){
			if((num1%i==0) && (num2%i==0))
				hcf=i;
		}
		System.out.println("HCF is : "+hcf);
	}
}
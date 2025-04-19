/*
2. Take two int values from user and print greatest among them.
*/

class Gratestno{
	public static void main(String ... s){
		int num1,num2;
		System.out.print("Enter the First No.  :");
		num1=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter the Second NO. :");
		num2=new java.util.Scanner(System.in).nextInt();
		if(num1>num2){
			System.out.print("Greatest No. is "+num1);
		}
		else if(num1<num2){
			System.out.print("Greatest No. is "+num2);
		}
		else{
			System.out.print("Both numbers are eqal.");
		}
	}
}
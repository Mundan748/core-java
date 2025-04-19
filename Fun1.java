/*
10. Write a do-while loop that asks the user to enter two numbers. The numbers should be added 
	and the sum displayed. The loop should ask the user whether he or she wishes to perform the 
	operation again. If so, the loop should repeat; otherwise it should terminate.
*/

class Fun1{
	public static void main(String[] args){
		int num1,num2,flag;
		do{
			System.out.print("Enter number1: ");
			num1= new java.util.Scanner(System.in).nextInt();
			System.out.print("Enter number2: ");
			num2= new java.util.Scanner(System.in).nextInt();
			System.out.println("Addition is "+(num1+num2));
			System.out.print("Do you want perform the operation again(1 or 0) :");
			flag= new java.util.Scanner(System.in).nextInt();
		}while(flag==1);
	}
}
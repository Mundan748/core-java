/*
22. Write a program to find the average of all numbers till a given number.
	Input(Integer)								Output(Integer)
	7 							(1+2+3+4+5+6+7)/7 = 4
	15 						(1+2+3+4+5+6+7+8+9+10+11+12+13+14+15)/15 = 8
*/

class Average{
	public static void main(String[] args){
		int num,sum=0;
		System.out.print("Enter a number : ");
		num= new java.util.Scanner(System.in).nextInt();
		for(int i=1;i<=num;i++)
			sum+=i;
		System.out.println("Average : "+sum/num);
	}
}
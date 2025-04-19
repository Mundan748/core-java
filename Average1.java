/*
23. Write a program to find the average of all even numbers till a given number.
	Input(Integer)						 Output(Integer) 
	7 								(2+4+6)/3 = 4
	15 								(2+4+6+8+10+12+14)/7 = 8
*/

class Average1{
	public static void main(String[] args){
		int num,sum=0;
		System.out.print("Enter a number : ");
		num= new java.util.Scanner(System.in).nextInt();
		for(int i=2;i<=num;i=i+2)
			sum+=i;
		System.out.println("Average : "+sum/(num/2));
	}
}
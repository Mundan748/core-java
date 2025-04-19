/*
24. Write a program to print Fibonacci series with the given size.
	Input(Integer)				 Printed Output
	4 							1,1,2,3,
	7							1,1,2,3,5,8,13,
	12 							1,1,2,3,5,8,13,21,34,55,89,144,
*/

class Fibonacci1{
	public static void main(String[] args){
		int n,a,b=0,c=1;
		System.out.print("Enter the term : ");
		n=new java.util.Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++){
			System.out.print(c+"\t");
			a=b;
			b=c;
			c=a+b;
		}
	}
}
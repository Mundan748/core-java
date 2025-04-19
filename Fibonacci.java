/*
14. Write a program to print Fibonacci series of n terms where n is input by user:
	0 1 1 2 3 5 8 13 24...
*/

class Fibonacci{
	public static void main(String[] args){
		int n,a,b=1,c=0;
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
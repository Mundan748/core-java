/*
15. Write a program to calculate the sum of following series where n is input by user.
	1 + 1/2 + 1/3 + 1/4 + 1/5 +.......+ 1/n
*/

class Series{
	public static void main(String[] args){
		int n;
		float sum=0;
		System.out.print("Enter the term : ");
		n=new java.util.Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++){
			sum+=(1f/i);
		}
		System.out.print("sum is : "+sum);
	}
}
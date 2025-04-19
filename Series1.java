/*
16. Compute the natural logarithm of 2, by adding up to n terms in the series 
	1 - 1/2 + 1/3 - 1/4 + 1/5 -.......+ 1/n
	where n is a positive integer and input by user.
*/

class Series1{
	public static void main(String[] args){
		int n;
		float sum=0;
		System.out.print("Enter the term(only +ve) : ");
		n=new java.util.Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++){
			if(i%2==0)
				sum-=(1f/i);
			else
				sum+=(1f/i);
		}
		System.out.print("sum is : "+sum);
	}
}
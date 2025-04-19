/*
7. Write a program that reads a set of integers, and then prints the sum of the even
   and odd integers.
*/

class Fun{
	public static void main(String[] args){
		int num,seven=0,sodd=0,size;
		System.out.print("Size of set :");
		size= new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter a number : ");
		num= new java.util.Scanner(System.in).nextInt();
		for(int i=1;i<=size-1;i++){
			System.out.print("One more : ");
			num= new java.util.Scanner(System.in).nextInt();
			if(num%2==0) seven+=num;
			else sodd+=num;
		}
		System.out.println("sum of even : "+seven);
		System.out.println("sum of odd  : "+sodd);
	}
}
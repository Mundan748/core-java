/*
21. Write a program to find the sum of the numbers divisible by 3 or 4 between two given numbers.
	Input Range Output
	10 to 20= 12 + 15 + 16 + 18 + 20 = 81
	NOTE: Although 12 is divisible by 3 and 4, it should be added only once
	200 to 215 = 200 + 201 + 204 + 207 + 208 + 210 + 212 + 213 = 1655
*/

class Fun5{
	public static void main(String[] args){
		int num1,num2,sum=0;
		System.out.print("Enter a range \nFrom: ");
		num1= new java.util.Scanner(System.in).nextInt();
		System.out.print("To: ");
		num2= new java.util.Scanner(System.in).nextInt();
		for(int i=num1;i<=num2;i++){
			if(i%3==0 || i%4==0)
				sum+=i;
		}
		System.out.println("Sum : "+sum);
	}
}
/*
26. Write a program to find the nearest Fibonacci number. The Fibonacci numbers are 
	1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.,. Assume that the input number will be always 
	greater than 3. There is no upper limit to the input number.
	Input(Integer) Output (Integer)
	9   			8 (9 is between 8 and 13 and is nearer to 8 than 13) 
	29 				34 (29 is between 21 and 34 and is nearer to 29 than 34)
	50 				55 (50 is between 34 and 55 and is nearer to 55 than 34)
*/	

class Fun6{
	public static void main(String[] args){
		int num,a=2,b=3,c=5,min=3,max=5,near;
		System.out.print("Enter the no : ");
		num=new java.util.Scanner(System.in).nextInt();
		while(max<=num){
			a=b;min=b;
			b=c;max=c;
			c=a+b;
		}
		if((max-num)>(num-min))
			near=min;
		else near=max;
		System.out.print("Nearest Fibonacci number :"+near);
	}
}
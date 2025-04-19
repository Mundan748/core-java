/*
25. Write a program to find the nearest perfect square of a given number. Assume that the given
	number isalways greater than 2.
	Input(Integer)			Output (Integer)
	3 						4 (Since 3 is between 1 and 4, but nearer to 4 than 1)
	9 						9 (Since 9 it is a perfect square)
	10 						9 (Since 10 is between 9 and 16, but nearer to 9 than 16)
	23 						25 (Since 23 is between 16 and 25, but nearer to 25) 
	17 						16 (Since 17 is between 16 and 25, but nearer to 16)
*/

class Fun7{
	public static void main(String[] args){
		int num,min=4,max=4,near;
		System.out.print("Enter the no : ");
		num=new java.util.Scanner(System.in).nextInt();
		for(int i=3;max<=num;i++){
			min=max;
			max=i*i;
		}
		if((max-num)>(num-min))
			near=min;
		else near=max;
		System.out.print("Nearest perfect square :"+near);
	}
}
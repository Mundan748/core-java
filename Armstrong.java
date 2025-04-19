/*
13. Write a program to print out all Armstrong numbers between 1 and 500. 
	If sum of cubes of each digit of the number is equal to the number itself,
	then the number is called an Armstrong number.
	For example, 153=(1*1*1)+(5*5*5)+(3*3*3)
*/

class Armstrong{
	static int pow(int a,int b){
		int power=1;
		for(int i=1;i<=b;i++)
			power*=a;
		return power;
	}
	static boolean checkarmstrong(int a){
		int temp,temp1,dig=0,armvalue=0;
		temp=temp1=a;
		while(temp>0){
			temp/=10;
			dig++;
		}
		for(int i=1;i<=dig;i++){
			temp=a%10;
			a/=10;
			armvalue+=pow(temp,dig);
		}
		if(temp1==armvalue)	return true;
		return false;
	}
	public static void main(String[] args){
		for(int i=1;i<=500;i++)
			if(checkarmstrong(i))
				System.out.print(i+"\t");
	}
}
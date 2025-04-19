/*
12. Write a program to enter the numbers till the user wants and at the end the program should 
	display the largest and smallest numbers entered.
*/

class Fun3{
	static int max(int a,int b){
		if(a>b)	return a;
		return b;
	}
	static int min(int a,int b){
		if(a<b)	return a;
		return b;
	}
	public static void main(String[] args){
		int num,smallest,largest,flag=0;
		System.out.print("Enter a number: ");
		num= new java.util.Scanner(System.in).nextInt();
		largest=smallest=num;
		System.out.print("For termenate pgm enter 999\n");
		do{
			System.out.print("Enter a number: ");
			num= new java.util.Scanner(System.in).nextInt();
			largest=max(largest,num);
			smallest=min(smallest,num);
			if(num==999){
				System.out.print("Do you want termenate the pgm(1 or 0) :");
				flag= new java.util.Scanner(System.in).nextInt();
			}
		}while(!(flag==1));
		System.out.println("largest no : "+largest+"\n smallest no : "+smallest);
	}
}
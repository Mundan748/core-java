/*
14. Take three values from the user and print them in ascending order
*/

class Ascorder{
	static int max(int a,int b){
		if(a>b) return a;
		return b;
	}
	static int min(int a,int b){
		if(a<b) return a;
		return b;
	}
	public static void main(String ... a){
		int num1,num2,num3,temp;
		System.out.print("Enter no.1 :");
		num1=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter no.2 :");
		num2=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter no.3 :");
		num3=new java.util.Scanner(System.in).nextInt();
		if(num1== min(num1,temp=min(num2,num3))){
			if(num2== temp)
				System.out.print(num1+"\t"+num2+"\t"+num3);
			else
				System.out.print(num1+"\t"+num3+"\t"+num2);
		}
		else if(num2== min(num2,temp=min(num1,num3))){
			if(num1== temp)
				System.out.print(num2+"\t"+num1+"\t"+num3);
			else
				System.out.print(num2+"\t"+num3+"\t"+num1);
		}
		else{
			if(num1== min(num1,num2))
				System.out.print(num3+"\t"+num1+"\t"+num2);
			else
				System.out.print(num3+"\t"+num2+"\t"+num1);
		}
	}
}
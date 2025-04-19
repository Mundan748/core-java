/*
6. Take Input of age of 3 people by user and determine oldest and youngest among them.
*/

class Agecomp{
	static int max(int a,int b){
		if(a>b) return a;
		return b;
	}
	static int min(int a,int b){
		if(a<b) return a;
		return b;
	}
	public static void main(String ... a){
		int age1,age2,age3,young,old;
		System.out.print("Enter people1 age :");
		age1=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter people2 age :");
		age2=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter people3 age :");
		age3=new java.util.Scanner(System.in).nextInt();
		young=min(age1,min(age2,age3));
		old=max(age1,max(age2,age3));
		System.out.println("oldest people is age of "+old);
		System.out.println("youngest people is age of "+young);
	}
}
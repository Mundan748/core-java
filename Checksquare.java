/*
1. Take values of length and breadth of a rectangle from user and check if it is square or not.
*/

class Checksquare{
	public static void main(String ... s){
		int length,breadth;
		System.out.print("Enter the length:");
		length=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter the breadth:");
		breadth=new java.util.Scanner(System.in).nextInt();
		if(length==breadth){
			System.out.print("It is a square with side "+length+" .");
		}
		else{
			System.out.print("It is not a square. ");
		}
	}
}
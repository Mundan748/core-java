/*
1. Write a program to print the area of a rectangle by creating a class named
   'Area' having two methods. First method named as 'setDim' takes length and 
   breadth of rectangle as parameters and the second method named as 'getArea' 
   returns the area of the rectangle. Length and breadth of rectangle are
   entered through keyboard.
*/

class Area{
	int length,breadth;
	void setDim(int l,int b){
		length=l;
		breadth=b;
	}
	int getArea(){
		return length*breadth;
	}
	public static void main(String ... s){
		System.out.print("Enter the length:");
		int l=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter the breadth:");
		int b=new java.util.Scanner(System.in).nextInt();
		Area r1=new Area();
		r1.setDim(l,b);
		System.out.println("Area is :"+r1.getArea());
	}
}
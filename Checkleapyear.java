/*
12. Write a program to check if a year is leap year or not.
	If a year is divisible by 4 then it is leap year but if the year is century year 
	like 2000, 1900, 2100 then it must be divisible by 400.
*/

class Checkleapyear{
	public static void main(String[] args){
		int year;
		boolean century;
		System.out.print("Enter year : ");
		year=new java.util.Scanner(System.in).nextInt();
		century = (year%100 == 0);
		if(century){
			if(year%400 == 0){
				System.out.println("Leap year");
			}
			else{
				System.out.println("not Leap year");
			}
		}
		else{
			if(year%4 == 0){
				System.out.println("Leap year");
			}
			else{
				System.out.println("not Leap year");
			}
		}
	}
}
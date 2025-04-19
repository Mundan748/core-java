/*
4. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
   Ask user for their salary and year of service and print the net bonus amount.
*/


class Calsalary{
	public static void main(String ... s){
		int salary,yearserv;
		double bonus=0;
		System.out.print("Enter your salary :");
		salary=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter Year of service :");
		yearserv=new java.util.Scanner(System.in).nextInt();
		if(yearserv>5){
			bonus=salary*0.05;
		}
		System.out.print("Net bonus amount :"+bonus);
	}
}
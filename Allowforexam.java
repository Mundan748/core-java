/*
8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
	Take following input from user
	Number of classes held
	Number of classes attended.
	And print percentage of class attended
	Is student is allowed to sit in exam or not.
*/

class Allowforexam{
	public static void main(String ... a){
		int tclass,attclass;
		float attclassPer;
		System.out.print("Number of classes held     : ");
		tclass=new java.util.Scanner(System.in).nextInt();
		System.out.print("Number of classes attended : ");
		attclass=new java.util.Scanner(System.in).nextInt();
		attclassPer=attclass*100f/tclass;	//find % of class attended
		System.out.println("percentage of class attended is "+attclassPer+"%");
		if(attclassPer<75){
			System.out.println("So, Not allowed to sit in exam .");
		}
		else{
			System.out.println("So, Allowed to sit in exam .");
		}
	}
}
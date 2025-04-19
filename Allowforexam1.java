/*
9. Modify the above question to allow student to sit if he/she has medical cause. 
   Ask user if he/she has medical cause or not ('Y' or 'N') and print accordingly.
*/

class Allowforexam{
	public static void main(String[] args){
		int tclass,attclass;
		char medcause;
		float attclassPer;
		System.out.print("Number of classes held     : ");
		tclass=new java.util.Scanner(System.in).nextInt();
		System.out.print("Number of classes attended : ");
		attclass=new java.util.Scanner(System.in).nextInt();
		System.out.print("medical cause('Y' or 'N') : ");
		medcause=new java.util.Scanner(System.in).next().charAt(0);
		attclassPer=attclass*100f/tclass;	//find % of class attended
		System.out.println("percentage of class attended is "+attclassPer+"%");
		if(attclassPer<75 && (medcause=='N'||medcause=='n')){
			System.out.println("So, Not allowed to sit in exam .");
		}
		else{
			System.out.println("So, Allowed to sit in exam .");
		}
	}
}
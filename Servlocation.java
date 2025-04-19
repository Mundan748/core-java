/*
13. Ask user to enter age, sex (M or F), marital status (Y or N) and 
	then using following rules print their place of service.
	if employee is female, then she will work only in urban areas.
	if employee is a male and age is in between 20 to 40 then he may work in anywhere
	if employee is male and age is in between 40 to 60 then he will work in urban areas only.
	And any other input of age should print "ERROR".
*/

class Servlocation{
	public static void main(String[] args){
		int age;
		char sex;
		System.out.print("Enter your age : ");
		age=new java.util.Scanner(System.in).nextInt();
		System.out.print("Sex('M' or 'F') : ");
		sex=new java.util.Scanner(System.in).next().charAt(0);
		/*
		System.out.print("marital status('Y' or 'N') : ");
		char marred=new java.util.Scanner(System.in).next().charAt(0);
		*/
		if(sex=='F'||sex=='f'){
			System.out.print("she will work only in urban areas.");
		}
		else if((sex=='M'||sex=='m') && (age>=20&&age<=40)){
			System.out.print("he may work in anywhere.");
		}
		else if((sex=='M'||sex=='m') && (age>=40&&age<=60)){
			System.out.print("he will work in urban areas only.");
		}
		else{
			System.out.print("ERROR");
		}
		
	}
}
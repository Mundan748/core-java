/*
5. A school has following rules for grading system:
	a. Below 25-F
	b. 25 to 45 - E
	c. 45 to 50 - D
	d. 50 to 60 - C
	e. 60 to 80-B
	f. Above 80 - A
	Ask user to enter marks and print the corresponding grade.
*/

class Grade{
	public static void main(String ... s){
		int mark;
		System.out.print("Enter your marks:");
		mark=new java.util.Scanner(System.in).nextInt();
		if(mark>=0 && mark<25){
			System.out.print("Grade : F");
		}
		else if(mark>=25 && mark<45){
			System.out.print("Grade : E");
		}
		else if(mark>=45 && mark<50){
			System.out.print("Grade : D");
		}
		else if(mark>=50 && mark<60){
			System.out.print("Grade : C");
		}
		else if(mark>=60 && mark<=80){
			System.out.print("Grade : B");
		}
		else if(mark>80 && mark<=100){
			System.out.print("Grade : A");
		}
		else{
			System.out.print("Invalid marks .");
		}
	}
}
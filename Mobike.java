/*Define a class called Mobike with the following description:
Instance variables/data members:
String bno - to store the bike's number (UP65AB1234)
String name to store the name of the customer
int days - to store the number of days the bike is taken on rent
int charge to calculate and store the rental charge
Member methods:
void input() to input and store the detail of the customer.
void compute() to compute the rental chargeThe rent for a mobike is charged on the following basis.
First five days Rs 500 per day;
Next five days Rs 400 per day
Rest of the days Rs 200 per day
void display () to display the details in the following format:
Bike No. Name No. of days Charge*/

class Mobike{
	String bno,name;
	int days,charge;
	void input(){
		System.out.print("Enter the Bike No.:");
		bno=new java.util.Scanner(System.in).nextLine();
		System.out.print("Enter the Coustomer Name:");
		name=new java.util.Scanner(System.in).nextLine();
		System.out.print("Enter the no. of days:");
		days=new java.util.Scanner(System.in).nextInt();
	}
	void compute(){
		if(days<=5){
			charge=500*days;
		}
		else if(days>5 && days<=10){
			charge=2500+400*(days-5);
		}
		else if(days>10){
			charge=4500+200*(days-10);
		}
	}
	void display(){
		System.out.println("Bike Number   :"+ bno);
		System.out.println("Customer Name :"+ name);
		System.out.println("Days for Rent :"+ days);
		System.out.println("Total Charge  :"+ charge);
	}
	
	public static void main(String ... a){
		Mobike b1=new Mobike();
		b1.input();
		b1.compute();
		b1.display();
	}
}
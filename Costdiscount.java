/*
3. A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
   Ask user for quantity
   Suppose, one unit will cost 100.
   Judge and print total cost for user.
*/

class Costdiscount{
	public static void main(String ... s){
		int unit,cost;
		double tcost;
		System.out.print("Enter the unit(1 unit for cost 100) :");
		unit=new java.util.Scanner(System.in).nextInt();
		cost=unit*100;
		if(cost>1000){
			tcost=cost*0.9;
		}
		else{
			tcost=cost;
		}
		System.out.print("Total cost :"+tcost);
	}
}
/*
3. Write a program that prompts the user to input a positive integer. It should then 
   print the multiplication table of that number.
*/

class Table{
	public static void main(String[] args){
		int num;
		System.out.print("Enter a +ve number : ");
		num= new java.util.Scanner(System.in).nextInt();
		for(int i=1;i<=10;i++){
			System.out.print(i*num +"\t");
		}
	}
}
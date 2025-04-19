/*
11. Write a program to enter the numbers till the user wants and at the end it should display 
	the count of positive, negative and zeros entered.
*/

class Fun2{
	public static void main(String[] args){
		int num,cp,cn,cz,flag;
		cp=cn=cz=flag=0;
		System.out.print("For termenate pgm enter 999\n");
		do{
			System.out.print("Enter a number: ");
			num= new java.util.Scanner(System.in).nextInt();
			if(num>0)	cp++;
			else if(num==0)	cz++;
			else cn++;
			if(num==999){
				System.out.print("Do you want termenate the pgm(1 or 0) :");
				flag= new java.util.Scanner(System.in).nextInt();
			}
		}while(!(flag==1));
		System.out.print("You entered "+(--cp)+" +ve no "+cn+" -ve no and "+cz+" zeros.");
	}
}
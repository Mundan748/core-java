/*
18. Write a program to print following:
	a)	**********			
		**********
		**********
		**********
		
	b)	*
		**
		***
		****
		*****
		
	c)		*
		   **
		  ***
		 ****
		*****
		
	d)	    *
		   ***
		  *****
		 *******
		*********
		
	e)	    1
		   222
		  33333
		 4444444
		555555555
		
	f)	    1
		   212
		  32123
		 4321234
		543212345
*/



class Pattern{
	public static void main(String[] args){
		System.out.println("a.\n");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=10;j++)
				System.out.print("*");
			System.out.print("\n");
		}
		System.out.println("\nb.\n");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.print("\n");
		}
		System.out.println("\nc.\n");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i+j>=6)
					System.out.print("*");	
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
		System.out.println("\nd.\n");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i+j>=6)
					System.out.print("*");	
				else
					System.out.print(" ");
			}
			for(int j=1;j<=i-1;j++)
				System.out.print("*");	
			System.out.print("\n");
		}
		System.out.println("\ne.\n");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i+j>=6)
					System.out.print(i);	
				else
					System.out.print(" ");
			}
			for(int j=1;j<=i-1;j++)
				System.out.print(i);	
			System.out.print("\n");
		}
		System.out.println("\nf.\n");
		
		for(int i=1;i<=5;i++){
			for(int j=5;j>=1;j--){
				if(j>i)
					System.out.print(" ");	
				else
					System.out.print(j);
			}
			for(int j=1;j<=i-1;j++)
				System.out.print(j+1);			
			System.out.print("\n");
		}
	}
}
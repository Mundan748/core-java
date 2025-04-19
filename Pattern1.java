class Pattern1{
	public static void main(String[] args){
		System.out.print("\n1.\n");
		
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
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j>i)
					System.out.print("*");	
				else
					System.out.print(" ");
			}
			for(int j=4-i;j>=1;j--)
				System.out.print("*");
			System.out.print("\n");
		}
		
		System.out.print("\n2.\n");
		
		for(int i=5;i>=1;i--){
			for(int j=i;j>=1;j--)
				System.out.print("* ");
			System.out.print("\n");
		}
		
		System.out.print("\n3.\n");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j>=i)
					System.out.print("* ");	
				else
					System.out.print("  ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n4.\n");
		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.print("\n");
		}
		for(int i=5;i>=1;i--){
			for(int j=i;j>=1;j--)
				System.out.print("* ");
			System.out.print("\n");
		}
		
		System.out.print("\n5.\n");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i+j>=6)
					System.out.print("* ");	
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j==1)
					System.out.print(" ");
				if(j>=i)
					System.out.print("* ");	
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n6.\n");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j>=i)
					System.out.print("* ");	
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i+j>=6)
					System.out.print("* ");	
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
		
		System.out.print("\n7.\n");
		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i+j==5 || j==4)
					System.out.print("* ");	
				else if(i+j>5)
					System.out.print("  ");
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
		for(int i=1;i<=9;i++)
			System.out.print("* ");
		
		System.out.print("\n\n8.\n");
		
		for(int i=1;i<=9;i++)
			System.out.print("* ");
		System.out.print("\n");
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j==i || j==4)
					System.out.print("* ");	
				else if(j>i)
					System.out.print("  ");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n9.\n");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i+j==6 || j==5)
					System.out.print("* ");	
				else if(i+j>6)
					System.out.print("  ");
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j==1)
					System.out.print(" ");
				if(j==i || j==4)
					System.out.print("* ");	
				else if(j>i)
					System.out.print("  ");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		
		System.out.print("\n10.\n");
		
		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=5;j++){
				if(j>=i)
					System.out.print(j+" ");	
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i+j>=6)
					System.out.print(j+" ");	
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
		
		System.out.print("\n11.\n");
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++)
				if(j<=i)
					System.out.print("*");
				else
					System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.print("\n");
		}
		for(int i=6;i>=1;i--){
			for(int j=6;j>=1;j--)
				if(i+j<7)
					System.out.print(" ");
				else
					System.out.print("*");
			for(int j=i;j>=1;j--)
				System.out.print("*");
			System.out.print("\n");
		}
		
		System.out.print("\n12.\n");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i+j>=6){
					if(i%2==0)
						System.out.print("-");
					else
						System.out.print("* ");
				}	
				else
					System.out.print(" ");
			}
			for(int j=1;j<=i-1;j++)
				if(i%2==0)
						System.out.print("-");
					else
						System.out.print("* ");	
			System.out.print("\n");
		}
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j>i)
					if(i%2==0)
						System.out.print("* ");
					else
						System.out.print("-");
				else
					System.out.print(" ");
			}
			for(int j=4-i;j>=1;j--)
				if(i%2==0)
						System.out.print("* ");
					else
						System.out.print("-");
			System.out.print("\n");
		}
		
		System.out.print("\n13.\n");
		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++)
				if(i%2==0)
						System.out.print("-");
					else
						System.out.print("* ");
			System.out.print("\n");
		}
		for(int i=5;i>=1;i--){
			for(int j=i;j>=1;j--)
				if(i%2==0)
						System.out.print("-");
					else
						System.out.print("* ");
			System.out.print("\n");
		}
		
		System.out.print("\n14.\n");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i+j>=6)
					if(i%2==0)
						System.out.print("-");
					else
						System.out.print("* ");	
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j==1)
					System.out.print(" ");
				if(j>=i)
					if(i%2==0)
						System.out.print("* ");
					else
						System.out.print("-");	
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n15.\n");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i+j==6)
					System.out.print("*");	
				else if(i+j>6)
					System.out.print("-");	
				else
					System.out.print(" ");
			}
			for(int j=1;j<=i-1;j++)
				if(j==i-1)	
					System.out.print("*");
				else
					System.out.print("-");	
			System.out.print("\n");
		}
		
		System.out.print("\n16.\n");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j==i)
					System.out.print("*");	
				else if(j>i)
					System.out.print("-");
				else
					System.out.print(" ");
			}
			for(int j=5-i;j>=1;j--)
				if(j==1)
					System.out.print("*");
				else
					System.out.print("-");
			System.out.print("\n");
		}
		
		System.out.print("\n17.\n");
		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i+j>=5)
					System.out.print("* ");	
				else
					System.out.print("  ");
			}
			for(int j=1;j<=3;j++)
				if(j<=i-1)
					System.out.print("* ");	
				else
					System.out.print("  ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print("* ");
			System.out.print("\n");
		}
		
		System.out.print("\n18.\n");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++)
				System.out.print(" ");
			for(int j=1;j<=5;j++)
				System.out.print("*");
			System.out.print("\n");
		}
		
		System.out.print("\n19.\n");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i-1;j++)
				System.out.print(" ");
			for(int j=1;j<=5;j++)
				System.out.print("*");
			System.out.print("\n");
		}
		
		System.out.print("\n20.\n");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++)
				if(i==1 || i==5 || j==1 || j==4)
					System.out.print("* ");
				else
					System.out.print("  ");
			System.out.print("\n");
		}
	}
}
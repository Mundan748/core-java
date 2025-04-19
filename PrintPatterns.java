class PrintPatterns{
	
	public static void printPatternA(int size){
		for(int i=1;i<=size;i++){
			for(int j=1;j<=i;j++){
				if((i+j)%2==0){
					System.out.print("0 ");
				}
				else{
					System.out.print("1 ");
				}
			}
			System.out.print("\n");
		}
	}
	public static void printPatternB(int size){
		for(int i=1;i<=size;i++){
			for(int j=size;j>=1;j--){
				if(i>=j){
					System.out.print("# ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
	public static void printPatternC(int size){
		for(int i=1;i<=size;i++){
			for(int j=1;j<=size;j++){
				if(j==(size/2)+1 || i==(size/2)+1 || i==1 || j==1 || i==size || j==size){
					System.out.print("# ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
	public static void printPatternD(int size){
		for(int i=1;i<=size;i++){
			for(int j=1;j<=size;j++){
				if(i==1 || i==size || i==j){
					System.out.print("# ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
	public static void printPatternE(int size){
		for(int i=1;i<=size;i++){
			for(int j=1;j<=size;j++){
				if(i==j || i+j==size+1 || i==1 || j==1 || i==size || j==size){
					System.out.print("# ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
	public static void printPatternF(int size){
		for(int i=1;i<=size;i++){
			for(int j=1;j<=size;j++){
				if(i<=j){
					System.out.print("# ");
				}
				else{
					System.out.print("  ");
				}
			}
			for(int j=size-i;j>=1;j--){
				System.out.print("# ");
			}
			System.out.print("\n");
		}
	}
	public static void printPatternG(int size){
		for(int i=1;i<=size;i++){
			for(int j=size;j>=1;j--){
				if(j<=i || i==1)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			for(int j=1;j<size;j++){
				if(j<i || i==1)
					System.out.print("# ");
			}
			System.out.print("\n");
		}
		for(int i=size;i>=1;i--){
			for(int j=size;j>=1;j--){
				if(i==1 || i>j)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			for(int j=1;j<size;j++){
				if(j<i-1 || i==1)
					System.out.print("# ");
			}
			System.out.print("\n");
		}
	}
	public static void printPatternH(int size){
		for(int i=1;i<=size;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
	}
	public static void printPatternI(int size){
		for(int i=size;i>=1;i--){
			for(int j=size;j>=1;j--){
				if(i>=j)
					System.out.print(j+" ");
				else
					System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public static void printPatternJ(int size){
		for(int i=1;i<=size;i++){
			for(int j=1,k=1;j<=size;j++){
				if(i<=j){
					System.out.print(k+++" ");
				}
				else{
					System.out.print("  ");
				}
			}
			for(int j=size-i;j>=1;j--){
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
	}
	public static void printPatternK(int size){
		for(int i=1;i<=size;i++){
			for(int j=1;j<=size;j++){
				if(j<=i)
					System.out.print(j+" ");
				else
					System.out.print("  ");
			}
			for(int j=size;j>=1;j--){
				if(j==size){}
				else if(i>=j){
					System.out.print(j+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
	public static void printPatternL(int size){
		for(int i=1;i<=size;i++){
			int k=i;
			for(int j=size;j>=1;j--){
				if(i>=j){
					System.out.print(k+++" ");
					if(k==10 && j!=1) k=0;
				}
				else{
					System.out.print("  ");
				}
			}
			k--;
			for(int j=1;j<i;j++){
				if(k==0) k=10;
				System.out.print(--k+" ");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args){
		printPatternG(8);
	}
}
class Pattern2{
	public static void main(String[] args){
		int n;
		System.out.print("Enter a no : ");
		n=new java.util.Scanner(System.in).nextInt();
		for(int i=n;i>=1;i--){
			for(int j=n;j>=1;j--){
				if(j>i)
					System.out.print(j+" ");
				else
					System.out.print(i+" ");
			}
			for(int j=2;j<=n;j++){
				if(i<=j)
					System.out.print(j+" ");
				else
					System.out.print(i+" ");
			}
			System.out.print("\n");
		}
		for(int i=2;i<=n;i++){
			for(int j=n;j>=1;j--){
				if(j>i)
					System.out.print(j+" ");
				else
					System.out.print(i+" ");
			}
			for(int j=2;j<=n;j++){
				if(i<=j)
					System.out.print(j+" ");
				else
					System.out.print(i+" ");
			}
			System.out.print("\n");
		}
	}
}

class PrintTriangles{
	
	public static void powerOf2Triangle(int size){
		int k;
		for(int i=0;i<=size;i++){
			k=0;
			for(int j=size;j>=1;j--){
				if(i>=j){
					System.out.print((int)Math.pow(2,k++)+"  ");
				}
				else{
					System.out.print("   ");
				}
			}
			k--;
			for(int j=1;j<i;j++){
				System.out.print((int)Math.pow(2,--k)+"  ");
			}
			System.out.print("\n");
		}
	}
	public static int fact(int x){
		int factV=1;
		while(x>1){
			factV*=x--;
		}
		return factV;
	}
	public static int nCr(int n,int r){
		return fact(n)/(fact(n-r)*fact(r));
	}
	public static void pascalTriangle1(int size){
		for(int i=0;i<=size-1;i++){
			for(int j=0;j<=i;j++){
				System.out.print(nCr(i,j)+" ");
			}
			System.out.print("\n");
		}
	}
	public static void pascalTriangle2(int size){
		for(int i=0;i<=size-1;i++){
			for(int j=size-2;j>=i;j--){
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++){
				int temp=nCr(i,j);
				if(temp<=9)
					System.out.print(temp+"   ");
				else
					System.out.print(temp+"  ");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args){
		pascalTriangle2(6);
	}
}
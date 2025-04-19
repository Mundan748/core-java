class TwoDArrayWith2Parameter{
	static void printArray(int x[][]){
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	static void matrixadd(int x[][], int y[][]){
		int add[][];
		add= new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[0].length;j++){
				add[i][j]=x[i][j]+y[i][j];
			}
		}
		printArray(x);
		printArray(y);
		printArray(add);
	}
	static void matrixmult(int x[][], int y[][]){
		if(x[0].length==y.length){
			int mul[][];
			mul= new int[x.length][y[0].length];
			for(int i=0;i<mul.length;i++){
				for(int j=0;j<mul.length;j++){
					mul[i][j]=calMul(x,y,i,j);
				}
			}
			printArray(x);
			printArray(y);
			printArray(mul);
		}
		else
			System.out.print("!mul not possible");
	}
	private static int calMul(int x[][], int y[][],int a,int b){
		int sum=0;
		for(int i=0;i<x[0].length;i++){
			sum+=x[a][i]*y[i][b];
		}
		return sum;
	}
	public static void main(String[] args){
		int x[][]={ {2,-6,5} , {3,-1,0} , {0,-3,9} };
		int y[][]={ {3,-1,0} , {2,-6,5} , {7,4,6} };
		//matrixadd(x,y);
		matrixmult(x,y);
	}
}
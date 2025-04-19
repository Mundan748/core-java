class TwoDArray{
	static void copyArray(int y[][],int x[][]){
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				y[i][j]=x[i][j];
			}
		}
	}
	static void printArray(int x[][]){
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	static int max1(int x[][]){
		int max=x[0][0];
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				max=Math.max(max,x[i][j]);
			}
		}
		return max;
	}
	static int min1(int x[][]){
		int min=x[0][0];
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				min=Math.min(min,x[i][j]);
			}
		}
		return min;
	}
	static void sortl(int x[][]){
		
	}
	static void matrixtranspose(int x[][]){
		int temp[][];
		temp= new int[x[0].length][x.length];
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[0].length;j++){
				temp[j][i]=x[i][j];
			}
		}
		printArray(temp);
	}
	static void matrixsum(int x[][]){
		int rSum,cSum,temp[][]=new int[x.length+1][x[0].length+1];
		int dSum=0;
		copyArray(temp,x);
		for(int i=0;i<temp.length-1;i++){
			rSum=cSum=0;
			for(int j=0;j<temp.length;j++){
				if(j==temp.length-1){
					temp[i][j]=rSum;
					temp[j][i]=cSum;
					temp[temp.length-1][temp.length-1]=dSum;
				}
				else{
					if(i==j){
						dSum+=temp[i][i];
					}
					rSum+=temp[i][j];
					cSum+=temp[j][i];
				}
			}
		}
		printArray(temp);
	}
	static void triangleAsum(int x[][]){
		int rSum,cSum,temp[][]=new int[x.length+1][x[0].length+1];
		int dSum=0;
		copyArray(temp,x);
		for(int i=0;i<temp.length-1;i++){
			rSum=cSum=0;
			for(int j=0;j<temp.length;j++){
				if(j==temp.length-1){
					temp[i][j]=rSum;
					temp[j][i]=cSum;
					temp[temp.length-1][temp.length-1]=dSum;
				}
				else if(i==j){
					dSum+=temp[i][i];
					rSum+=temp[i][j];
					cSum+=temp[j][i];
				}
				else if(i<j){
					rSum+=temp[i][j];
				}
				else{
						cSum+=temp[j][i];
				}
			}
		}
		printArray(temp);
	}
	static void triangleAmax(int x[][]){
		int max=x[0][0];
		for(int i=0;i<x.length;i++){
			for(int j=i;j<x.length;j++){
				max=Math.max(max,x[i][j]);
			}
		}
		System.out.print("\nmax of upper triangle is "+max);
	}
	static void triangleAmin(int x[][]){
		int min=x[0][0];
		for(int i=0;i<x.length;i++){
			for(int j=i;j<x.length;j++){
				min=Math.min(min,x[i][j]);
			}
		}
		System.out.print("\nminof upper triangle is "+min);
	}
	static void triangleBsum(int x[][]){
		int sum=0;
		for(int i=0;i<x.length;i++){
			for(int j=i;j>=0;j--){
				sum+=x[i][j];
			}
		}
		System.out.print("\nsum of lower triangle is "+sum);
	}
	static void triangleBmax(int x[][]){
		int max=x[0][0];
		for(int i=0;i<x.length;i++){
			for(int j=i;j>=0;j--){
				max=Math.max(max,x[i][j]);
			}
		}
		System.out.print("\nmax of lower triangle is "+max);
	}
	static void triangleBmin(int x[][]){
		int min=x[0][0];
		for(int i=0;i<x.length;i++){
			for(int j=i;j>=0;j--){
				min=Math.min(min,x[i][j]);
			}
		}
		System.out.print("\nmin of lower triangle is "+min);
	}
	static void makeAllElementZero(int z[][]){
		class NestedFun{
            static void assin2(int x[][],int a,int b,int c,int d){
				if(x[a][b]!=0)	x[a][b]=-1;
				if(x[c][d]!=0)	x[c][d]=-1;
			}
			static void assin3(int x[][],int a,int b,int c,int d,int e,int f){
				if(x[a][b]!=0)	x[a][b]=-1;
				if(x[c][d]!=0)	x[c][d]=-1;
				if(x[e][f]!=0)	x[e][f]=-1;
			}
			static void assin4(int x[][],int a,int b,int c,int d,int e,int f,int g,int h){
				if(x[a][b]!=0)	x[a][b]=-1;
				if(x[c][d]!=0)	x[c][d]=-1;
				if(x[e][f]!=0)	x[e][f]=-1;
				if(x[g][h]!=0)	x[g][h]=-1;
			}
        }
		for(int i=0;i<z.length;i++){
			for(int j=0;j<z.length;j++){
				if(z[i][j]==0){
					if(i==0||j==0||i==z.length-1||j==z.length-1){
						if(i==0 && j==0)
							NestedFun.assin2(z,0,1,1,0);
						else if(i==0 && j==z.length-1)
							NestedFun.assin2(z,0,z.length-2,1,z.length-1);
						else if(i==z.length-1 && j==0)
							NestedFun.assin2(z,z.length-2,0,z.length-1,1);
						else if(i==z.length-1 && j==z.length-1)
							NestedFun.assin2(z,z.length-2,z.length-1,z.length-1,z.length-2);
						else if(i==0||i==z.length-1){
							if(i==0)
								NestedFun.assin3(z,i,j-1,i,j+1,i+1,j);
							else
								NestedFun.assin3(z,i,j-1,i,j+1,i-1,j);
						}
						else if(j==0)
							NestedFun.assin3(z,i-1,j,i+1,j,i,j+1);
						else 
							NestedFun.assin3(z,i-1,j,i+1,j,i,j-1);
					}
					else{
						NestedFun.assin4(z,i,j-1,i,j+1,i-1,j,i+1,j);
					}
				}
			}
		}
		for(int i=0;i<z.length;i++){
			for(int j=0;j<z.length;j++){
				if(z[i][j]==-1)	z[i][j]=0;
			}
		}
		printArray(z);
	}
	
	public static void main(String[] args){
		int x[][]={ {2,0,5,5,3} , {3,-2,0,5,3} , {0,-3,9,2,4} };
		int y[][]={ {2,4,5,5,3},{2,2,4,5,3} , {3,-2,0,5,3} , {3,-3,9,2,4},{6,-3,3,-2,3} };
		//matrixtranspose(x);
		//matrixsum(x);
		//triangleAsum(x);
		//triangleBsum(x);
		//System.out.print(max1(x));
		//System.out.print(min1(x));
		//makeAllElementZero(y);
	}
}
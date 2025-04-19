class OneDArrayWith2Parameter{
	static void printArray(int x[]){
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+"\t");
		}
	}
	static void sort(int x[]){
		for(int i=0;i<x.length-1;i++){
			for(int j=i+1;j<x.length;j++){
				if(x[i]>x[j]){
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
	}
	static int[] mergesort(int x[], int y[]){
		int len=Math.max(x.length,y.length);
		int temp[]=new int[x.length+y.length];
		for(int i=0,j=0;i<len;i++){
			if(x.length>i && y.length>i){
				temp[j++]=x[i];
				temp[j++]=y[i];
			}
			else if(y.length<=i){
				temp[j++]=x[i];
			}
			else{
				temp[j++]=y[i];
			}
		}
		sort(temp);
		//printArray(temp);
		return temp;
	}
	static void union(int x[], int y[]){
		int temp[]=mergesort(x,y);
		int i=0,j=0;
		while(i<temp.length){
			if(i==temp.length-1){
				temp[j++]=temp[i];
			}
			else if(temp[i]!=temp[i+1]){
				temp[j++]=temp[i];
			}
			i++;
		}
		int temp1[]=new int[j];
		for(int k=0;k<j;k++){
			temp1[k]=temp[k];
		}
		printArray(temp1);
	}
	static void intersection(int x[], int y[]){
		int len=Math.min(x.length,y.length);
		int temp[],temp1[],k=0; 
		temp= new int[len];
		for(int i=0;i<x.length;i++){
			int count=0;
			for(int j=0;j<y.length;j++){
				if(x[i]==y[j] && count==0){
					temp[k++]=x[i];
					count++;
					y[j]=-1;
				}
				else if(x[i]==y[j]) y[j]=-1;
			}
		}
		temp1=new int[k];
		for(int i=0;i<k;i++){
			temp1[i]=temp[i];
		}
		sort(temp1);
		printArray(temp1);
	}
	public static void main(String[] args){
		int x[]={1,3,5,7,3,2,8,0,5};
		int y[]={5,8,2,8,3,1,6,0};
		union(x,y);
		//intersection(x,y);
	}
}
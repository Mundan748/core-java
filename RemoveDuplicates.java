/*
46. Write a program to remove duplicates from array in Java?
*/

class RemoveDuplicates{
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
	static void printArray(int x[]){
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+"\t");
		}
	}
	public static void main(String[] args){
		int j=0,x[]={5,6,7,8,9,0,9,8,7,6,5,4};
		printArray(x);
		sort(x);
		for(int i=0;i<x.length;i++){
			if(i==x.length-1){
				x[j++]=x[i];
			}
			else if(x[i]!=x[i+1]){
				x[j++]=x[i];
			}
		}
		int temp[]=new int[j];
		for(int k=0;k<j;k++){
			temp[k]=x[k];
		}
		System.out.println("");
		printArray(temp);
	}
}
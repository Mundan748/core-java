/*
42. Given two array sort the values of one array using the second array.
	input: String array[]={"a", "b", "c", "d", "e", "f", "g","h", "i"); 
	int array2()=(0,1,1,0,1,2,2,0,1);
	Output: ("a", "d", "h", "b", "c", "e", "i", "f", "g")
	input: array1={"g", "e", "o", "k", "s", "f", "o", "r", "g", "o", "o", "k", "s"} 
	array2={0,1,1,0,1,2,2,0,1}
	Output {"g","k", "r", "e", "e", "g", "s", "f", "o"}
*/

class SortUsing2Array{
	static void printArray(String x[]){
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+"\t");
		}
	}
	public static void main(String[] args){
		String y[]={"g", "e", "o", "k", "s", "f", "o", "r", "g", "o", "o", "k", "s"}; 
		int x[]={0,1,1,0,1,2,2,0,1};
		printArray(y);
		for(int i=0;i<x.length-1;i++){
			for(int j=i+1;j<x.length;j++){
				if(x[i]>x[j]){
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					String temp1=y[i];
					y[i]=y[j];
					y[j]=temp1;
				}
			}
		}
		System.out.println();
		printArray(y);
	}
}
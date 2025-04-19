/*
41. Find the numbers which is not repeated in array of integers, others are present for
	two times.
	input: 23,34,56,21,21,56,78,23,34
*/

class NotRepeatedNo{
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
	public static void main(String[] args){
		int i=0,x[]={23,34,56,21,21,56,78,23,34};
		sort(x);
		while(i<x.length){
			if(i==x.length-1)
				System.out.print(x[i]+"\t");
			else if(x[i]==x[i+1])	i++;
			else
				System.out.print(x[i]+"\t");
			
			i++;
		}
	}
}
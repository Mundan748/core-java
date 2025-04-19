/*
37. Given an array of elements. The task is to sort the array and calculate the 
	cumulative frequency of each element of the array
	Input arr[]={1,3,2,1,2,4};
	output:
		1->2
		2->4
		3->5
		4->6
	Input arr[]={1,2,1,2,1,2};
	output:
		1->3
		2->6
*/
class ComulativeFrequency{
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
		int count=1,cEle,x[]={1,2,1,2,1,2};
		sort(x);
		cEle=x[0];
		for(int i=1;i<x.length;i++){
			if(cEle!=x[i]){
				System.out.println(cEle+" -> "+count);
				cEle=x[i];
			}
			count++;
			if(i==x.length-1){
				System.out.println(cEle+" -> "+count);
			}
		}
	}
}
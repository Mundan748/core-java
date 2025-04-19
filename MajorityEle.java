/*
38. write a java program to get the majority element from an given array of integers 
	containing duplicates.
	Majority element: A majority element is an element that appears more than n/2 
	where n is the size of the array.
	input ayrr[]={1,1,2,3,1,5,3,1,1,1};
	output =1
*/

class MajorityEle{
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
		int z[]={1,1,2,3,1,5,3,1,1,1};
		int mode=z[0],pCount=1,count;
		sort(z);
		for(int i=0,j=0;i<z.length;i=j){
			count=0;
			while(j<z.length && z[i]==z[j]){
				count++;
				j++;
			}
			if(pCount<count){
				mode=z[i];
				pCount=count;
			}
		}
		if(pCount>z.length/2)
			System.out.println(mode);
		else
			System.out.println("! not present");
	}
}
/*
36. WAP to find Kth smallest element in unsorted Array
		input arr[]={7,10,4,3,20,15}
			k=3
			Ouput=7
		input arr[]={7,10,4,3,20,15}
			k=4
			Ouput=10
*/

class KthSmallEle{
	static int min(int x[]){
		int min=x[0],index=0;
		for(int i=1;i<x.length;i++){
			min=Math.min(min,x[i]);
			if(min==x[i])	index=i;	
		}
		x[index]=999;
		return min;
	}
	public static void main(String[] args){
		int k,kthEle=0,x[]={7,10,4,3,20,15};
		System.out.print("k = ");
		k=new java.util.Scanner(System.in).nextInt();
		for(int i=1;i<=k;i++){
			kthEle=min(x);
		}
		System.out.println("Kth element is "+kthEle);
	}
}
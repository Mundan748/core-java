/*
40. A unsorted array of integers is given you need to find the max product formed by
	multiplying three numbers. (You can not sort the array, watch out when there are 
	negative numbers)
	array[]={2,5,-2,6,-3,8,0,-7,-9,4};
*/

class MaxProduct{
	static int min(int x[]){
		int min=x[0];
		for(int i=1;i<x.length;i++){
			min=Math.min(min,x[i]);
		}
		return min;
	}
	public static void main(String[] args){
		int x[]={2,5,-2,6,-3,8,0,-7,-9,4};
		int g1,g2,g3;
		g1=g2=g3=min(x);
		for(int i=0;i<x.length;i++){
			if(x[i]>g1){
				g3=g2;
				g2=g1;
				g1=x[i];
			}
			else if(x[i]>g2){
				g3=g2;
				g2=x[i];
			}
			else if(x[i]>g3){
				g3=x[i];
			}
		}
		if(g1*g2*g3>0){
			System.out.println(g1*g2*g3);
		}
		else if()
	}
}
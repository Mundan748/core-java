/*
45. How to find all pairs on integer array whose sum is equal to given number?
*/
class PairsOfSum{
	public static void main(String[] args){
		int x[]={1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
		int number=9;
		for(int i=0;i<x.length-1;i++){
			for(int j=i+1;j<x.length;j++){
				if(x[i]+x[j]==number){
					System.out.println("( "+x[i]+" , "+x[j]+" )");
				}
			}
		}
	}
}
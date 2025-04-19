/*
50. How to find the smallest positive integer value that cannot be represented as sum of any 
	subset of a given array?
	You have given a sorted array (sorted in non-decreasing order) of positive numbers, find
	the smallest positive integer value that cannot be represented as sum of elements of any 
	subset of given set. What makes it more challenging is expected time complexity of O(n)
	Examples:
	Input: (1, 3, 6, 10, 11, 15);
	Output: 2
*/

class SmallPositiveInt{
	public static void main(String[] args){
		int x[]={1, 3, 6, 10, 11, 15};
		int pNum=1,sum=0;
		for(int i=0;i<x.length;i++){
			sum+=x[i];
			if(x[i]>pNum){
				if(sum>pNum){
					System.out.println(pNum);
				}
			}
			pNum++;
		}
	}
}
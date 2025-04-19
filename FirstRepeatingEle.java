/*
49. How find the first repeating element in an array of integers?
	Given an array of integers, find the first repeating element in it. We need to find the 
	element that occurs more than once and whose index of the first occurrence is smallest.
	Examples:
	Input: input [] (10, 5, 3, 4, 3, 5, 6)
	Output: 5 (5 is the first element that repeats)
*/
class FirstRepeatingEle{
	public static void main(String[] args){
		int x[]={10, 5, 3, 4, 3, 5, 6};
		int i=0,j;
		while(i<x.length-1){
			j=i+1;
			while(j<x.length){
				if(x[i]==x[j]){
					System.out.println(x[i]);
					i=j=x.length;
				}
				j++;
			}
			i++;
		}
	}
}
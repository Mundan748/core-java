/*
51. How to rearrange array in alternating positive and negative number?
	Given an array of positive and negative numbers, arrange then in an alternate fashion
	such that every positive number is followed by negative and vice-versa maintaining the 
	order of appearance.
	Number of positive and negative numbers need not be equal. If there are more positive 
	munbers they appear at the end of the array. If there are more negative numbers, they too
	appear in the end of the array.
	Example:
	Input: (1, 2, 3, -4, -1, 4)
	Output: (-4, 1, -1, 2, 3, 4)
	Input: (-5, -2, 5, 2, 4, 7, 1, 8, 0, -8) 
	output: (-5, 5, -2, 2, -8, 4, 7, 1, 8, 0)
*/

class ArrangeAltPosNeg{
	public static void main(String[] args){
		int pos=0,neg=0,x[]={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		while(pos<x.length || neg<x.length){
			while(neg<x.length && x[neg]>=0)	neg++;
			if(neg<x.length){
				System.out.print(x[neg++]+"\t");
			}
			while(pos<x.length&&x[pos]<0)		pos++;
			if(pos<x.length){
				System.out.print(x[pos++]+"\t");
			}
			
		}
	}
}
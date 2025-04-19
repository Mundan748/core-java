/*
48. How to find common elements in three sorted array?
	Given three arrays sorted in non-decreasing order, print all common elements in these arrays.
	Examples:
	inputl (1, 5, 10, 20, 40, 80)
	input2 (6, 7, 20, 80, 100)
	input3 (3, 4, 15, 20, 30, 70, 80, 120)
	Output: 20,80
*/
class CommonEle{
	public static void main(String[] args){
		int[] x={1, 5, 10, 20, 40, 80};
		int[] y={6, 7, 20, 80, 100};
		int[] z={3, 4, 15, 20, 30, 70, 80, 120};
		int i=0,j=0,k=0;
		while(i<x.length && x[i]<y[y.length-1]){
			while(j<y.length && y[j]<z[z.length-1]){
				if(x[i]<y[j]) break;
				else if(x[i]==y[j]){
					while(k<z.length){
						if(y[j]<z[k]) break;
						else if(y[j]==z[k]){
							System.out.print(z[k]+"\t");
						}
						k++;
					}
				}
				j++;
			}
			i++;
		}
	}
}
class OneDArray{
	static void printArray(int x[]){
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+"\t");
		}
	}
	static int max(int x[]){
		int max=x[0];
		for(int i=1;i<x.length;i++){
			max=Math.max(max,x[i]);
		}
		return max;
	}
	static int min(int x[]){
		int min=x[0];
		for(int i=1;i<x.length;i++){
			min=Math.min(min,x[i]);
		}
		return min;
	}
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
		//System.out.print("\n");
		//printArray(x);
	}
	static void shift(int x[]){
		int count=0;
		sort(x);
		while(x[count]<0){
			count++;
		}
		int lPtr=0,rPtr=count-1;
		while(lPtr<rPtr){
			count=x[lPtr];
			x[lPtr++]=x[rPtr];
			x[rPtr--]=count;
		}
		printArray(x);
	}
	static void firstnonrepeatingelement(int x[]){
		for(int i=0;i<x.length-1;i++){
			if(x[i]==-1) continue;
			boolean flag =true;
			for(int j=i+1;j<x.length;j++){
				if(x[i]==x[j]){
					x[j]=-1;
					flag=false;
				}
			}
			if(flag){
				System.out.println(x[i]);
				break;
			}
		}
	}
	static void frequencycount(int x[]){
		for(int i=0;i<x.length-1;i++){
			if(x[i]==-1) continue;
			int count=1;
			for(int j=i+1;j<x.length;j++){
				if(x[i]==x[j]){
					x[j]=-1;
					count++;
				}
			}
			System.out.print(x[i]+" comes "+count+" times\n");
		}
	}
	static int binarytodecimal(int x[]){
		int num=0;
		for(int i=0;i<x.length;i++){
			num+=(x[i]*Math.pow(2,x.length-1-i));
		}
		return num;
	}
	static int find3rdLargestValueInArray(int x[]){
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
		return g3;
	}
	static void LCM(int x[]){
		int i,maxEle=max(x);
		boolean flag=true;
		while(flag){
			for(i=0;i<x.length;i++){
				if(maxEle%x[i]!=0) break;
			}
			if(i==x.length) flag=false;
			else maxEle++;
		}
		System.out.println(maxEle);
	}
	static void HCF(int x[]){
		int i,minEle,hcf;
		int maxEle=max(x);
		hcf=minEle=1;
		while(maxEle>minEle){
			for(i=0;i<x.length;i++){
				if(x[i]%minEle!=0) break;
			}
			if(i==x.length){
				hcf=minEle;
			}
			minEle++;
		}
		System.out.println(hcf);
	}
	static float findMedian(int z[]){
		//order the set the no, the median is the middle no
		int mid=z.length/2;
		sort(z);
		if(z.length%2!=0){
			return z[mid];
		}
		else{
			return (z[mid-1]+z[mid])/2f;
		}
	}
	static float findMean(int z[]){
		//add all the no then divide by the amount of no
		float sum=0;
		for(int i=0;i<z.length;i++){
			sum+=z[i];
		}
		return sum/z.length;
	}
	static int findMode(int z[]){
		//the most common no
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
		return mode;
	}
	public static void main(String[] args){
		int x[]={2,7,-5,-9,-3};
		//System.out.println(max(x));
		//System.out.println(min(x));
		//sort(x); printArray(x);
		//shift(x);
		//firstnonrepeatingelement(x);
		//frequencycount(x);
		//System.out.print(binarytodecimal(new int[]{1,1,0,1,0}));
		//System.out.print(find3rdLargestValueInArray(x));
		//LCM(new int[]{24,36,40});
		//HCF(new int[]{108,132});
		//System.out.println(findMedian(new int[]{3,6,2,7,8,1}));
		//System.out.println(findMean(new int[]{3,6,2,1}));
		System.out.println(findMode(new int[]{3,2,5,6,3,3,6,2,1}));
	}
}
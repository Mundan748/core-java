class TargetArray{
	public static void main(String[] args){
		int arr[]={16};
		int count=0,x=arr[0];
		while(x>0){
			if(x>2 && x%2==0){
				x/=2;
				count++;
			}
			else{
				x--;
				count++;
			}
		}
		System.out.println(count);
	}
}
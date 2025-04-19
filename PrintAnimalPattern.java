class PrintAnimalPattern{
	public static void main(String[] args){
		String name;
		System.out.print("Enter a name: ");
		name= new java.util.Scanner(System.in).nextLine();
		int len= name.length();
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(j==0){
					System.out.print(name.charAt(i)+" ");
				}
				else if(len%2==0 && (i==j || i+j==len)){
					System.out.print("* ");
				}
				else if(len%2!=0 && (i==j || i+j==len-1)){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
}
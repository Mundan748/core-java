class TicTacToe{
	static void printArray(char x[][]){
		for(int i=0;i<x.length;i++){
			System.out.print("\t");
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+"\t");
			}
			System.out.print("\n\n");
		}
	}
	public static void main(String[] args){
		char cSymb,x[][]={{'_','_','_'},{'_','_','_'},{'_','_','_'}};
		boolean flag=true,flag1=true;
		byte i=0,j=0,playerTrack=0;
		printArray(x);
		System.out.println("\n-----GAME START-----\n");
		while(flag){
			playerTrack++;
			while(flag1){
				if(playerTrack%2==0) System.out.print("enter position PLAYER2 :");
				else	System.out.print("enter position PLAYER1 :");
				i=new java.util.Scanner(System.in).nextByte();
				j=new java.util.Scanner(System.in).nextByte();
				if(i>2 || i<0 ||j>2||j<0)
					System.out.println("!invalid position try again");
				else if(x[i][j]!='_')
					System.out.println("!element already there try again");
				else
					flag1=false;
			}
			if(playerTrack%2==0) cSymb='X';
			else	cSymb='O';
			x[i][j]=cSymb;
			printArray(x);
			if(x[0][j]==cSymb && x[1][j]==cSymb && x[2][j]==cSymb ||
				x[i][0]==cSymb && x[i][1]==cSymb && x[i][2]==cSymb ||
				x[0][0]==cSymb && x[1][1]==cSymb && x[2][2]==cSymb ||
				x[0][2]==cSymb && x[1][1]==cSymb && x[2][0]==cSymb){
					if(cSymb=='O')	System.out.println("PLAYER1 WIN");
					else	System.out.println("PLAYER2 WIN");
					flag=false;
					
			}
			else if(playerTrack>=9){
				System.out.println("oops! no one can win");
				flag=false;
			}
			flag1=true;
		}
	}
}
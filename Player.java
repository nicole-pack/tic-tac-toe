package tic-tac-toe;

class Player {
	final String token;
	
	public Player(){
	}
	
	public Player(String xo){
		this.token = xo;
	}
	
	public void setToken(String xo){
		this.token = xo;
	}
	
	public String getToken(){
		return token;
	}
	
	public int selectSpace(boolean[] selectionBoard){
		Scanner scan = new Scanner(System.in);
		int space = scan.nextInt()-1;
		if(space<0 || space>8){
			System.out.println("Please choose a space from the board.");
			this.selectSpace(selectionBoard);
		}
		if(selectionBoard[space]){
			System.out.println("Please choose an empty space.");
			this.selctSpace(selectionBoard);
		}
		return space;
	}
	
	public void ouputWinner();
}
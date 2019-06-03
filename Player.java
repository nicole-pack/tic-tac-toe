import java.util.Scanner;

class Player {
	String token;
	boolean turnLog[];
	public Player(){
	}
	
	public Player(String xo){
		this.token = xo;
		turnLog = new boolean[9];
		turnLog[0] = false;
		turnLog[1] = false;
		turnLog[2] = false;
		turnLog[3] = false;
		turnLog[4] = false;
		turnLog[5] = false;
		turnLog[6] = false;
		turnLog[7] = false;
		turnLog[8] = false;
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
			this.selectSpace(selectionBoard);
		}
		turnLog[space] = true;
		return space;
	}
	
	public void ouputWinner(){
		
	}
}
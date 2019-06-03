

class GameBoard {
	String gameBoard[];
	boolean selectionBoard[];
	int gameLog[];
	int numTurns;
	boolean winnerDeclared = false;
	public GameBoard(){
		gameBoard = new String[9];
		selectionBoard = new boolean[9];
		//Try using linked list for gameLog
		//gameLog = new String[9];
		numTurns = 0;
		//Initiate game board
		gameBoard[0] = "1";
		gameBoard[1] = "2";
		gameBoard[2] = "3";
		gameBoard[3] = "4";
		gameBoard[4] = "5";
		gameBoard[5] = "6";
		gameBoard[6] = "7";
		gameBoard[7] = "8";
		gameBoard[8] = "9";
		//Initiate selected spaces
		selectionBoard[0] = false;
		selectionBoard[1] = false;
		selectionBoard[2] = false;
		selectionBoard[3] = false;
		selectionBoard[4] = false;
		selectionBoard[5] = false;
		selectionBoard[6] = false;
		selectionBoard[7] = false;
		selectionBoard[8] = false;
		
	}
	
	public void printBoard(){
		System.out.println("" + gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
		System.out.println("- - - - -");
		System.out.println("" + gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
		System.out.println("- - - - -");
		System.out.println("" + gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
	}
	public void updateBoard(int input, String token){
		int position = input;
		gameBoard[position] = token;
		selectionBoard[position] = true;
		//gameLog[numTurns] = position;
		this.printBoard();
		numTurns++;
	}
	public boolean checkWinner(boolean[] turnLog){
		if(turnLog[4]){
			if(turnLog[0]&&turnLog[8]){
				winnerDeclared = true;
			}
			else if(turnLog[1]&&turnLog[7]){
				winnerDeclared = true;
			}
			else if(turnLog[2]&&turnLog[6]){
				winnerDeclared = true;
			}
			else if(turnLog[3]&&turnLog[5]){
				winnerDeclared = true;
			}
		}
		else if(turnLog[0]){
			if(turnLog[1]&&turnLog[2]){
				winnerDeclared = true;
			}
			else if(turnLog[3]&&turnLog[6]){
				winnerDeclared = true;
			}
		}
		else if(turnLog[8]){
			if(turnLog[2]&&turnLog[5]){
				winnerDeclared = true;
			}
			else if(turnLog[6]&&turnLog[7]){
				winnerDeclared = true;
			}
		}
		return winnerDeclared;
	}
}
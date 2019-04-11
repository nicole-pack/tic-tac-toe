import java.util.Scanner;

class TestTicTacToe{
		public static String gameBoard[] = new String[9];
		public static boolean selectionBoard[] = new boolean[9];
		public static Scanner scan = new Scanner(System.in);
		public static boolean player1Turn = true;
		public static int numTurns = 9;
		Player player1;
		Player player2;
	public static void main(String args[]){
		//Populate game board
		gameBoard[0] = "1";
		gameBoard[1] = "2";
		gameBoard[2] = "3";
		gameBoard[3] = "4";
		gameBoard[4] = "5";
		gameBoard[5] = "6";
		gameBoard[6] = "7";
		gameBoard[7] = "8";
		gameBoard[8] = "9";
		//Populate selected spaces
		selectionBoard[0] = false;
		selectionBoard[1] = false;
		selectionBoard[2] = false;
		selectionBoard[3] = false;
		selectionBoard[4] = false;
		selectionBoard[5] = false;
		selectionBoard[6] = false;
		selectionBoard[7] = false;
		selectionBoard[8] = false;
		
		TestTicTacToe.initializeGame(player1, player2);
		TestTicTacToe.printBoard(gameBoard);
		while(numTurns>0){
			if(player1Turn){
				TestTicTacToe.updateBoard(player1.selectSpace(selectionBoard), player1.getToken());
				player1Turn = false;
			}
			else{
				TestTicTacToe.updateBoard(player2.selectSpace(selectionBoard), player2.getToken());
				player1Turn = true;
			}
		}
	}
	
	//Handled in the GameDisplay class
	public static void initializeGame(Player p1, Player p2){
		System.out.println("1 player or 2 players");
		if(scan.nextInt()==1){
			//Computer was selected; Player order is randomly selected
			p1 = new Player("X");
			p2 = new RandomComputer("O");
		}
		else if(scan.nextInt()==2){
			//Two human players selected; Players will choose who is who
			p1 = new Player("X");
			p2 = new Player("O");
		}
		else{
			this.initializeGame(p1, p2);
		}
	}
	
	/*
	//Implemented in GameBoard class
	public static void printBoard(String[] board){
		System.out.println("" + gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
		System.out.println("- - - - -");
		System.out.println("" + gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
		System.out.println("- - - - -");
		System.out.println("" + gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
	}
	public static void updateBoard(int input, String token){
		int position = input;
		gameBoard[position] = token;
		selectionBoard[position] = true;
		TestTicTacToe.printBoard(gameBoard);
		numTurns--;
	}
	*/
	
}

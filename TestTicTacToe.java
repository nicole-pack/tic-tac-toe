import java.util.Scanner;

package TicTacToe;

class TestTicTacToe{
		public static String gameBoard[] = new String[9];
		public static boolean selectionBoard[] = new boolean[9];
		public static Scanner scan = new Scanner(System.in);
		public static boolean player = false;
		public static int numTurns = 9;
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
		TestTicTacToe.printBoard(gameBoard);
		while(numTurns>0){
			TestTicTacToe.updateBoard(scan.nextInt(), TestTicTacToe.nextTurn(player));
		}
	}
	public static void printBoard(String[] board){
		System.out.println("" + gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
		System.out.println("- - - - -");
		System.out.println("" + gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
		System.out.println("- - - - -");
		System.out.println("" + gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
	}
	public static void updateBoard(int input, String token){
		int position = input-1;
		if(selectionBoard[position]){
			System.out.println("This spot has been taken. Choose another.");
			TestTicTacToe.updateBoard(scan.nextInt(), TestTicTacToe.nextTurn(player));
		}
		else{
			gameBoard[position] = token;
			selectionBoard[position] = true;
			TestTicTacToe.printBoard(gameBoard);
			if(player){ player = false; }
			else{ player = true; }
			numTurns--;
		}
	}
	public static String nextTurn(boolean player){
		if(player){
			return "O";
		}
		return "X";
	}
}

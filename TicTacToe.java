import java.util.Scanner;

public class TicTacToe {
	public static void main(String args[]){
		
		Player player1;
		Player player2;
		GameDisplay display = new GameDisplay();
		//Leaving the player instantiation to the GameDisplay class
		//  does not feel correct, so will probably be changed later
		display.createGameWindow(player1, player2);
		GameBoard game = new GameBoard(player1, player2);
		game.printBoard();
	}
}
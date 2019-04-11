import java.util.Scanner;

public class TicTacToe {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		//Human player is instantiated as player1 and player2 is chosen
		Player player1 = new Player("X");
		Player player2 = null;
		
		System.out.println("1 player or 2 players?");
		while(player2 == null){
			if(scan.nextInt()==1){
				//Computer opponent was selected
				player2 = new RandomComputer("O");
			}	
			else if(scan.nextInt()==2){
				//Two human players selected; Players will choose who is who
				//(implement name entry)
				player2 = new Player("O");
			}
		}
		
		GameBoard game = new GameBoard();
		game.printBoard();
		int nextSpace;
		System.out.println("Player 1 turn");
		//player1 turn
		nextSpace = player1.selectSpace(game.selectionBoard);
		game.updateBoard(nextSpace, player1.getToken());
		while(game.numTurns<5){
			//player2 turn
			nextSpace = player2.selectSpace(game.selectionBoard);
			game.updateBoard(nextSpace, player1.getToken());
			game.printBoard();
			//player1 turn
			nextSpace = player1.selectSpace(game.selectionBoard);
			game.updateBoard(nextSpace, player1.getToken());
			game.printBoard();
		}
		String winner = game.checkWinner(player1.turnLog);
		
		
	}
	public RandomComputer addRandomComputer(){
		
	}
	public LearningComputer addLearningComputer(){
		
	}
	public Player addHumanPlayer(){
		
	}
}
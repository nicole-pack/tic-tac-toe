import java.util.Scanner;

class GameDisplay{
	Scanner scan = new Scanner(System.in);
	public void createGameWindow(Player p1, Player p2){
		//This is where the players will be instantiated
		//Placeholder code until GUI is created
		System.out.println("1 player or 2 players?");
		this.instantiatePlayers(p1, p2);
	}
	public void instantiatePlayers(Player p1, Player p2){
		if(scan.nextInt()==1){
			//Computer opponent was selected; Player order is randomly selected
			//(implement random selection)
			p1 = new Player("X");
			p2 = new RandomComputer("O");
		}
		else if(scan.nextInt()==2){
			//Two human players selected; Players will choose who is who
			//(implement name entry)
			p1 = new Player("X");
			p2 = new Player("O");
		}
		else{
			this.instantiatePlayers(p1, p2);
		}
	}
}
import java.util.Random;

class LearningComputer extends Player {
	String token;
	//import File api
	//File input;
	String[] odds;
	//Initialize fileInputReader
	Random rng = new Random();
	double random;
	int select;
	int space;
	//Constructor: writes token placement odds into array
	public LearningComputer(String xo){
		this.token = xo;
		//File reader
	}
	//OVERRIDE: Place token based on rng + past winnings knowledge
	public int selectSpace(boolean[] selectionBoard){
		random = rng.nextDouble();
		//Investigate Math class for int return types
		//select = Math.floor(random * 9);
		space = select-1;
		//Implement odds array
		if(space<0 || space>8){
			this.selectSpace(selectionBoard);
		}
		if(selectionBoard[space]){
			this.selectSpace(selectionBoard);
		}
		return space;
	}
	//Initialize fileOutputWriter
	//Output writes game data of the winner to a file
}
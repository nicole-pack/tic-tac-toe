package tic-tac-toe;

class RandomComputer extends Player {
	String token;
	File input;
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
	//OVERRIDE: Place token based on rng
	public int selectSpace(boolean[] selectBoard){
		random = rng.nextDouble();
		select = Math.floor(random * 9);
		space = select-1;
		if(space<0 || space>8){
			this.selectSpace(selectionBoard);
		}
		if(selectionBoard[space]){
			this.selctSpace(selectionBoard);
		}
		return space;
	}
}
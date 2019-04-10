import java.lang.Math;

class RandomComputer extends Player {
	String token;
	//import File api
	//File input;
	String[] odds;
	//Initialize fileInputReader
	double random;
	int select;
	int space;
	//Constructor: writes token placement odds into array
	public RandomComputer(String xo){
		this.token = xo;
		//File reader
	}
	//OVERRIDE: Place token based on rng
	public int selectSpace(boolean[] selectBoard){
		random = Math.random();
		select = (int)Math.floor(random * 9);
		space = select-1;
		if(space<0 || space>8){
			this.selectSpace(selectBoard);
		}
		if(selectBoard[space]){
			this.selectSpace(selectBoard);
		}
		return space;
	}
}
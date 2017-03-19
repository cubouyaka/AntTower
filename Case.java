public class Case {

    Board board;
    boolean in; //false if it's a border
    int x, y; //position
    int pheromones;
    Case [] around; //0-top 1-top_r 2-right 3-bot_r 4-bot
    boolean t; //if there is a tower
    Tower tower;

    public Case(int x, int y){
	this.x = x;
	this.y = y;
	in = true; //not a border
	pheromones = 0;
	around = new Case[5];
	around[0] = board.cases[x-1][y];
	around[1] = board.cases[x-1][y+1];
	around[2] = board.cases[x][y+1];
	around[3] = board.cases[x+1][y+1];
	around[4] = board.cases[x+1][y];
	t = false;	
    }

    //in the case of a border
    public Case(int x, int y, boolean in){
	this.x = x;
	this.y = y;
	in = false;	
    }

    public Case next_random(){
	return this;
    }

    public Case next_best(){
	return this;
    }

}
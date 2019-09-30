package FactoryMethod;

public class OrdinaryMazeGame extends MazeGame {
	
	@Override
    protected Room makeRoom() {
        return new OrdinaryRoom(); 
    }	
}

MazeGame ordinaryGame = new OrdinaryMazeGame();
MazeGame magicGame = new MagicMazeGame();
	

	

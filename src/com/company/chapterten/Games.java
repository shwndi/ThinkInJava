package com.company.chapterten;

/**
 * @author czy
 * @date 2020-8-3
 */
interface Game{
	boolean move();
}
interface GameFactory{
	Game getGame();
}
class Checkes implements Game{
	private Checkes(){}
	private int moves = 0;
	private static final int MAVES = 3;
	@Override
	public boolean move(){
		System.out.println("Checks move"+moves);
		return ++moves!=MAVES;
	}
	public static GameFactory gameFactory = new GameFactory() {
		@Override
		public Game getGame() {
			return new Checkes();
		}
	};
}
class Chess implements Game{
	private Chess(){}
	private int moves = 0;
	private static final int MAVES = 4;
	@Override
	public boolean move(){
		System.out.println("Checks move"+moves);
		return ++moves!=MAVES;
	}
	public static GameFactory gameFactory = new GameFactory() {
		@Override
		public Game getGame() {
			return new Chess();
		}
	};
}
public class Games {
	public static void getGame(GameFactory gameFactory){
		Game game = gameFactory.getGame();
		while(game.move()){}
	}

	public static void main(String[] args) {
		getGame(Checkes.gameFactory);
		getGame(Chess.gameFactory);
	}
}


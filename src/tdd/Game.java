package tdd;

public class Game {
	private int scoreFinal;
	
	public Game() {
		this.scoreFinal = 0;
	}

	public void roll(int i) {
		this.scoreFinal += i;
	}

	public int score() {

		return this.scoreFinal;
	}

}

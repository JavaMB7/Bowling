package tdd;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
	
	Game game;
	
	@BeforeEach
	void init() {
		game = new Game();
	}
	
	@Test
	void test_aucune_quilles() {
		for(int i = 0; i<20; i++) {
			game.roll(0);
		}
		assertEquals(0, game.score());
	}
	
	@Test
	void test_vingt_un() {
		for(int i = 0; i<20; i++) {
			game.roll(1);
		}
		assertEquals(20, game.score());
	}
	
	@Test
	void test_dix_un_et_dix_deux() {
		for(int i = 0; i<10; i++) {
			game.roll(1);
		}
		for(int i = 0; i<10; i++) {
			game.roll(2);
		}
		assertEquals(30, game.score());
	}
}
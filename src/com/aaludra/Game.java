package com.aaludra;

/*
 * Implemented Interface interface annotation called @override is not there
 */
public class Game implements GameInterface {
	@Override
	public void up() {
		System.out.println("Jump");
	}
	@Override
	public void down() {
		System.out.println("Down to underground");
	}
	@Override
	public void right() {
		System.out.println("Runforward");
	}
	@Override
	public void left() {
		System.out.println("RunBack");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameInterface game = new Game();
		game.up();
		game.down();
		game.right();
		game.left();

	}

}


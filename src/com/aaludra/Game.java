package com.aaludra;

public class Game implements Interface {
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Down to underground");
	}
	public void right() {
		System.out.println("Runforward");
	}
	public void left() {
		System.out.println("RunBack");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface game=new Game();
		game.up();
		game.down();
		game.right();
	    game.left();

	}

}

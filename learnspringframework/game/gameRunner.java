package com.in28minutes.learnspringframework.game;

public class gameRunner {
	private GamingConsole game;
	
	
	public gameRunner(GamingConsole game) {
		this.game = game; 
	}


	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right(); 
	}
}

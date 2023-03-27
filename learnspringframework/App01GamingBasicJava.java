package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.gameRunner;
import com.in28minutes.learnspringframework.game.marioGame;
import com.in28minutes.learnspringframework.game.pacManGame;
import com.in28minutes.learnspringframework.game.superContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
//		var game = new marioGame(); 
//		var game = new superContraGame(); 
		var game = new pacManGame();  // 1: Object creation
		var gameRunner = new gameRunner(game); // 2: Object Creation + wiring of Dependencies
		// Game is a Dependency of the GameRunner Class
		// Game is being injected/wired into the gameRunner class
		
		gameRunner.run(); 
	}

}

package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.gameRunner;
import com.in28minutes.learnspringframework.game.pacManGame;


@Configuration 
public class GameConfiguration {
	
	@Bean
	
	public GamingConsole game() {
		var game = new pacManGame(); 
		return game; 
	}
	
	@Bean
	
	public gameRunner GameRunner(GamingConsole game) {
		var gameRunner = new gameRunner(game); 
		return gameRunner; 
	}
//	var game = new pacManGame();  // 1: Object creation
//
//	var game = new marioGame(); 
////	var game = new superContraGame(); 
//	var gameRunner = new gameRunner(game); // 2: Object Creation + wiring of Dependencies
//	// Game is a Dependency of the GameRunner Class
//	// Game is being injected/wired into the gameRunner class
//	
//	gameRunner.run(); 
}

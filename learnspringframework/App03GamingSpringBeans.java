package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.gameRunner;
import com.in28minutes.learnspringframework.game.marioGame;
import com.in28minutes.learnspringframework.game.pacManGame;
import com.in28minutes.learnspringframework.game.superContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			
			
			context.getBean(gameRunner.class).run();

		}

	}

}

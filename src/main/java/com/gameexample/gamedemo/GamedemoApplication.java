package com.gameexample.gamedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.gameexample.gamedemo.game.GameRunner;
import com.gameexample.gamedemo.game.MarioGame;
import com.gameexample.gamedemo.game.SuperContraGame;

@SpringBootApplication
@ComponentScan("com.gameexample.gamedemo")
public class GamedemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GamedemoApplication.class, args);
		GameRunner runner=context.getBean(GameRunner.class);
	//MarioGame game = new MarioGame();
	//	SuperContraGame game=new SuperContraGame();
		//GameRunner runner	= new GameRunner(game);
		runner.runGame();

	}

}

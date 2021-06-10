package com.gameexample.gamedemo.game;

import org.springframework.stereotype.Component;


public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("jump");
	}
	public void down() {
		System.out.println("bend");
	}
	public void left() {
		System.out.println("speed up");
	}
	public void right() {
		System.out.println("stop");
	}
}

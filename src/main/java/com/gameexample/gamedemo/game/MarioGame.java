package com.gameexample.gamedemo.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("UP");
	}
	@Override
	public void down() {
		System.out.println("down");
	}
	@Override
	public void left() {
		System.out.println("left");
	}
	@Override
	public void right() {
		System.out.println("right");
	}
}

package com.OOPSLEVEL2;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Move Piece Up" + "\n");
	}

	@Override
	public void down() {
		System.out.println("Move Piece Down" + "\n");
	}

	@Override
	public void left() {
		System.out.println("Move Piece Left" + "\n");
	}

	@Override
	public void right() {
		System.out.println("Move Piece Right" + "\n");
	}

}

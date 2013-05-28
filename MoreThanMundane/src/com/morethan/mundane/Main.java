package com.morethan.mundane;

public class Main {

	public static UniqueID uniqueId;
	public static Player player;
	public static World world;
	public static Listener listener;
	public static Command command;

	public static void main(String[] args) {
		
		uniqueId = new UniqueID();
		player = new Player(EnumCreature.PLAYER);
		world = new World();
		listener = new Listener();
		command = new Command();
	}

}

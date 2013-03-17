package com.textadventure.game;

public class ScriptDOD extends Script{

	@SuppressWarnings("unused")
	private String ScriptName="Dungeon Of Dev";
	
	public static void readPass(int x)
	{
		if (x==0)
		{
			Text.print(Welcome00);
		}
	}
	
	private static String Welcome00 = "Hello, and welcome to More Than Mundane."+Text.lineBreak()+
			"Type 'help' for a list of general commands."+Text.lineBreak()+
			"You are in a small room.";
	
}

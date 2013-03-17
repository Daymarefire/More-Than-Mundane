package com.textadventure.game;

public class ScriptCommand extends ScriptBase{
	
	@SuppressWarnings("unused")
	private String ScriptName = "Command";

	public static void readPass(int x)
	{
		if (x==0)
		{
			Text.print(Help00);
		}
	}
	
	private static String Help00 = "help: Brings up this list of commands."+Text.lineBreak()+
					"help *command*: Tells more about the action."+Text.lineBreak()+
					"attack *creature*: Enters comabt with a creature, or attacks if you are already in combat."+Text.lineBreak()+
					"pickup *object*: Adds an object to your inventory."+Text.lineBreak()+
					"examine *object*: Tells you more about an object or area.";
	
}

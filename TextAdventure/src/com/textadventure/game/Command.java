package com.textadventure.game;
//Class that handles non-special script input from the player
public class Command {

	public static void recieve()//Receives the input from the listener and passes it to the ScriptCommand Class
	{
		String string = Listener.fetch().toLowerCase();
		if (string.equals("help"))
		{
			ScriptCommand.readPass(0);
		}
		else if (firstWord(string).equals("help")&&containsSpace(string))
		{
			ScriptCommand.readPassSpec("help", secondaryWords(string));
		}
		else
		{
			Text.print("What?");
		}
	}
	
	private static boolean containsSpace(String string)//Returns true for strings with a space and false otherwise
	{
		if (string.contains(" "))
		{
			return true;
		}
		return false;
	}
	
	private static String firstWord(String string)//Returns the first word of a string, should always be preceded by containsSpace
	{
		if (string.contains(" "))
		{
			return string.substring(0,string.indexOf(' ')-1);
		}
		return string;
	}

	private static String secondaryWords(String string)//Returns a string of the words following the first word in a string, precede with containsSpace
	{
		if (string.contains(" "))
		{
			return string.substring(string.indexOf(' ')+1);
		}
		return string;
	}
	
	@SuppressWarnings("unused")
	private static String finalWord(String string)//Returns the final word of the string
	{
		if (string.contains(" "))
		{
			return string.substring(string.lastIndexOf(' ')+1);
		}
		return string;
	}
}

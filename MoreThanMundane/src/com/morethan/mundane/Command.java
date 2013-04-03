package com.morethan.mundane;

import java.util.Iterator;

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
		else if ((firstWord(string).equals("move")||firstWord(string).equals("go"))&&containsSpace(string))
		{
			if (!World.ExteriorWorld[Player.PlayerLocationX][Player.PlayerLocationY][Player.PlayerLocationZ].ExitMap.isEmpty())
			{
				Area area = World.ExteriorWorld[Player.PlayerLocationX][Player.PlayerLocationY][Player.PlayerLocationZ];
				Iterator<String> KeyIterator = area.ExitMap.keySet().iterator();
				String CurrentIteration;
				for (int x = 0; x<area.ExitsInArea-1&&KeyIterator.hasNext(); x++)
				{
					CurrentIteration = (String) KeyIterator.next();
					if (area.ExitMap.get(CurrentIteration).exit.getName().equals(secondaryWords(string))||area.ExitMap.get(CurrentIteration).exit.getName().equals(secondaryWords(secondaryWords(string))))
					{
						Player.PlayerLocationX = area.ExitMap.get(CurrentIteration).ExitTargetX;
						Player.PlayerLocationY = area.ExitMap.get(CurrentIteration).ExitTargetY;
						Player.PlayerLocationZ = area.ExitMap.get(CurrentIteration).ExitTargetZ;
						World.ExteriorWorld[Player.PlayerLocationX][Player.PlayerLocationY][Player.PlayerLocationZ].enterArea();
					}
				}
			}
		}
		else
		{
			Text.printNew("What?");
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

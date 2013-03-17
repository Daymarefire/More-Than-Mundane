package com.textadventure.game;
//Handles text input
public class Text {

	public static void print(String string)
	{
		System.out.println(string);
	}
	
	public static String lineBreak()//Returns the linebreak character appropriate for the OS
	{
		return System.getProperty("line.separator");
	}
	
}

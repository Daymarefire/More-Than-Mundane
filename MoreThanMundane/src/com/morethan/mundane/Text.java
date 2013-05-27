package com.morethan.mundane;
//Handles text input
public class Text {
	
	public static void print(String string)
	{
		System.out.print(string);
	}
	
	public static void printNew(String string)
	{
		System.out.print(lineBreak()+string);
	}
	
	public static String lineBreak()//Returns the linebreak character appropriate for the OS
	{
		return System.getProperty("line.separator");
	}
	
}

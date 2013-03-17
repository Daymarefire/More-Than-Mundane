package com.textadventure.game;
//handler for debugging error reports, insert every time there is a potential for a loop breaking bug
public class Error {

	public static void report(int error)
	{
		if(error==0){Text.print("Error 0: Scanner has failed to recieve input");}
		else if(error==1){Text.print("Error 1: Input is not a valid string");}
		else{Text.print("Error: Unhandled Error, view crash log for info");}
	}
	
}

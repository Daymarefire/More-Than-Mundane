package com.morethan.mundane;
//Receives input from the player, used only through Command or special scripts unless simply waiting to continue
import java.util.Scanner;

public class Listener {
	private static String string;
	public static String fetch()
	{
		
		try
		{
			Scanner scan = new Scanner(System.in);
			string = scan.nextLine();
			scan.close();
			return string;
		}
		catch(java.util.InputMismatchException e)
		{
			Error.report(1);
			fetch();
		}
		Error.report(0);
		System.exit(0);
		return string;
	}
	
}

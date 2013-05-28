package com.morethan.mundane;

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
			fetch();
		}
		System.exit(0);
		return string;
	}	
}
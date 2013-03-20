package com.morethan.mundane;
//handler for debugging error reports, insert every time there is a potential for a loop breaking bug
public class Error {

	public static void report(int error)
	{
		if(error==0){Text.printNew("Error 0: Scanner has failed to recieve input");}
		else if(error==1){Text.printNew("Error 1: Input is not a valid string");}
		else{Text.printNew("Error: Unhandled Error, view crash log for info");}
	}
	
}

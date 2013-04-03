package com.morethan.mundane;

public class Exit {

	String Name;
	EnumExit exit;
	int ExitTargetX;
	int ExitTargetY;
	int ExitTargetZ;
	
	public Exit (EnumExit exit, int x, int y, int z)
	{
		Name = exit.getName();
		this.exit=exit;
		ExitTargetX = x;
		ExitTargetY = y;
		ExitTargetZ = z;
	}
	
	public Exit (String name, EnumExit exit, int x, int y, int z)
	{
		Name = name;
		this.exit=exit;
		ExitTargetX = x;
		ExitTargetY = y;
		ExitTargetZ = z;
	}
	
	int getX(){return ExitTargetX;}
	int getY(){return ExitTargetY;}
	int getZ(){return ExitTargetZ;}
}

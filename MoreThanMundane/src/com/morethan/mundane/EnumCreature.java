package com.morethan.mundane;

public enum EnumCreature {

	PLAYER("player");
	
	private String t;
	
	EnumCreature(String type)
	{
		t = type;
	}
	
	String getType()
	{
		return t;
	}

}

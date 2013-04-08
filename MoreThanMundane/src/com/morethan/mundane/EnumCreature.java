package com.morethan.mundane;

public enum EnumCreature {

	OGRE("Ogre", "humanoid");
	
	private String n;
	private String t;
	
	EnumCreature(String Name, String Type)
	{
		n = Name;
		t = Type;
	}
	
	String getName()
	{
		return n;
	}
	
	String getType()
	{
		return t;
	}
}

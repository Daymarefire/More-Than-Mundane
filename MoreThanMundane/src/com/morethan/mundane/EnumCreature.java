package com.morethan.mundane;

public enum EnumCreature {

	PLAYER("player", new ScriptGenericCreature());
	
	private String t;
	private Script s;
	
	EnumCreature(String type, Script script)
	{
		t = type;
		s = script;
	}
	
	String getType()
	{
		return t;
	}

	Script getScript()
	{
		return s;
	}
}

package com.morethan.mundane;

public enum EnumExit {

	DOOR("Door", " a ", new ScriptGenericExit());
	
	private String n;
	private String a;
	private Script s;
	
	EnumExit(String name, String article, Script script)
	{
		n = name;
		a = article;
		s = script;
	}
	
	String getName()
	{
		return n;
	}
	
	String getArticle()
	{
		return a;
	}
	
	Script getScript()
	{
		return s;
	}
}

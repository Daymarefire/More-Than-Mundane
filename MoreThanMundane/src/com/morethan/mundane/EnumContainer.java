package com.morethan.mundane;

public enum EnumContainer {

	CHEST("Chest", " a ", new ScriptGenericContainer());
	
	private String n;
	private String a;
	private Script s;
	
	EnumContainer(String name, String article, Script script)
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
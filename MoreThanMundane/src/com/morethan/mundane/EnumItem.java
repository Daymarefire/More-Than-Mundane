package com.morethan.mundane;

public enum EnumItem {

	STICK("Stick", " a ", new ScriptGenericItem());
	
	private String n;
	private String a;
	private Script s;
	
	EnumItem(String name, String article, Script script)
	{
		n = name;
		a = article;
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

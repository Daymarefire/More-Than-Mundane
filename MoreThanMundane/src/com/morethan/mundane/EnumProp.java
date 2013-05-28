package com.morethan.mundane;

public enum EnumProp {

	CHAIR("Chair", " a ", new ScriptGenericProp());
	
	private String n;
	private String a;
	private Script s;
	
	EnumProp(String name, String article, Script script)
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

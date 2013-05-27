package com.morethan.mundane;

public enum EnumProp {

	CHAIR("Chair", " a ");
	
	private String n;
	private String a;
	
	EnumProp(String name, String article)
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
}

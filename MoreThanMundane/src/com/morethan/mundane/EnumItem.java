package com.morethan.mundane;

public enum EnumItem {

	STICK("Stick", " a ");
	
	private String n;
	private String a;
	
	EnumItem(String name, String article)
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

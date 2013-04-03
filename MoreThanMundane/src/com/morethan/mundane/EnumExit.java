package com.morethan.mundane;

public enum EnumExit {

	DOOR_WOOD("","","");
	
	private String n;
	private String a;
	private String d;
	
	EnumExit(String Name, String Article, String Description) 
	{
		n=Name;	
		a=Article;
		d=Description;
	}
	
	String getName()
	{
		return n;
	}
	
	String getArticle()
	{
		return a;
	}
	
	String getDescription()
	{
		return d;
	}
}

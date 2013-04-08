package com.morethan.mundane;

public class Exit {

	String Name;
	String Article;
	String Description;
	EnumExit exit;
	int ExitTargetX;
	int ExitTargetY;
	boolean Custom;
	
	public Exit (EnumExit exit, int x, int y)
	{
		Name = exit.getName();
		Article = exit.getArticle();
		Description = exit.getDescription();
		ExitTargetX = x;
		ExitTargetY = y;
		Custom = false;
	}
	
	public Exit (String name, String article, String description, int x, int y)
	{
		Name = name;
		Article = article;
		Description = description;
		ExitTargetX = x;
		ExitTargetY = y;
		Custom = true;
	}
	
	String getName()
	{
		return Name;
	}
	
	String getArticle()
	{
		return Article;
	}
	
	String getDescription()
	{
		return Description;
	}
	
	int getX()
	{
		return ExitTargetX;
	}
	
	int getY()
	{
		return ExitTargetY;
	}
	
	boolean isCustom()
	{
		return Custom;
	}
}

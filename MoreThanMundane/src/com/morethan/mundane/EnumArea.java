package com.morethan.mundane;

public enum EnumArea {

	FOREST_LIT("Sunny Forest", "", ""),
	STONE_ROOM_LARGE("Large Stone Room", "Large stone blocks make up the walls of the room.", "The walls are made of large stone blocks which have been stuck together with a crubling mortar."),
	STONE_ROOM_SMALL("Small Stone Room", "The walls are made of rough hewn stone.", "The rough hewn stone walls are worn smooth by years of ocasional touches, and the floor below is equally worn.");
	
	private String n;
	private String d;
	private String dd;
	
	EnumArea(String name, String description, String detailedDescription)
	{
		n = name;
		d = description;
		dd = detailedDescription;
	}
	
	String getName()
	{
		return n;
	}
	
	String getDescription()
	{
		return d;
	}
	
	String getDetailedDescription()
	{
		return dd;
	}

}

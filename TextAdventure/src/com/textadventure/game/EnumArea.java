package com.textadventure.game;

public enum EnumArea {
	
	SMALL_STONE_ROOM("Small Stone Room", 4, 3, 0, 0, false, "The walls are made of rough hewn stone.", "The rough hewn stone walls are worn smooth by years of ocasional touches, and the floor below is equally worn."),
	LARGE_STONE_ROOM("Large Stone Room", 8, 6, 0, 0, false, "Large stone blocks make up the walls of the room.", "The walls are made of large stone blocks which have been stuck together with a crubling mortar.");
	
	private String n;
	private int x;
	private int p;
	private int s;
	private int i;
	private boolean e;
	private String d;
	private String dd;
	
	EnumArea(String Name, int MaximumNumberOfExits, int MaximumNumberOfProps, int PropListSet, int ItemListSet, boolean Exterior, String Description, String DetailedDescription)
	{
		Name = n;
		MaximumNumberOfExits = x;
		MaximumNumberOfProps = p;
		PropListSet = s;
		ItemListSet = i;
		Exterior = e;
		Description = d;
		DetailedDescription = dd;
	}
}

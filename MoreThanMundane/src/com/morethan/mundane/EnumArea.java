package com.morethan.mundane;

public enum EnumArea {
	
	FOREST_LIT("Sunny Forest", 10, 10, 1, 1, true, "", ""),
	STONE_ROOM_LARGE("Large Stone Room", 10, 6, 0, 0, false, "Large stone blocks make up the walls of the room.", "The walls are made of large stone blocks which have been stuck together with a crubling mortar."),
	STONE_ROOM_SMALL("Small Stone Room", 6, 3, 0, 0, false, "The walls are made of rough hewn stone.", "The rough hewn stone walls are worn smooth by years of ocasional touches, and the floor below is equally worn.");
	
	private String n;
	private int x;
	private int p;
	private int s;
	private int i;
	private boolean e;
	private String d;
	private String dd;
	
	EnumArea(String Name, int MaximumNumberOfExits, int MaximumNumberOfProps, int PropSetList, int ItemSetList, boolean Exterior, String Description, String DetailedDescription)
	{
		n = Name;
		x = MaximumNumberOfExits;
		p = MaximumNumberOfProps;
		s = PropSetList;
		i = ItemSetList;
		e = Exterior;
		d = Description;
		dd = DetailedDescription;
	}
	
	String getName()
	{
		return n;
	}
	
	int getMaximumNumberOfExits()
	{
		return x;
	}
	
	int getMaximumNumberOfProps()
	{
		return p;
	}
	
	int getPropList()
	{
		return s;
	}
	
	int getItemList()
	{
		return i;
	}
	
	boolean isExterior()
	{
		return e;
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

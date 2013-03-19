package com.textadventure.game;

public class Area {
	
	EnumArea Area;
	int PropsInArea = 0;
	
	public Area(EnumArea area, boolean isRandomized)
	{
		if (!isRandomized)
		{
			Area = area;
		}
		else
		{
			
		}
	}
	
	public void addPropTooArea(EnumProp propEnum, boolean isRandomizedProp)
	{
		if(PropsInArea<Area.getMaximumNumberOfProps())
		{
			Prop prop = new Prop(propEnum, isRandomizedProp, Area.getItemList());
		}
	}
	
	public void enterArea()
	{
		
	}
	
}

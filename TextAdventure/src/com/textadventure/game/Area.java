package com.textadventure.game;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Area {
	
	private String DescribeProps;
	int PropsInArea = 0;
	EnumArea Area;
	Prop prop;
	Map<String, Prop> PropMap = new HashMap<String, Prop>();
	
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
	
	public void addPropToArea(EnumProp propEnum, boolean isRandomizedProp)
	{
		if(PropsInArea<Area.getMaximumNumberOfProps())
		{
			Prop prop = new Prop(propEnum, isRandomizedProp, Area.getItemList());
			PropMap.put(prop.Prop.getName()+PropsInArea, prop);
		}
		else{}
	}
	
	public void enterArea()
	{
		Text.printNew("You enter a "+Area.getName()+". "+Area.getDescription()+describeProps());
	}
	
	private void describeCreatures()
	{
		
	}
	
	private void describeItems()
	{
		
	}
	
	private String describeProps()
	{
		if (!PropMap.isEmpty())
		{
			DescribeProps = " There is";
			Iterator<String> KeyIterator = PropMap.keySet().iterator();
			String CurrentIteration;
			for (int x = 0; x<PropsInArea-1&&KeyIterator.hasNext(); x++)
			{
				CurrentIteration = (String) KeyIterator.next();
				DescribeProps = DescribeProps+PropMap.get(CurrentIteration).Prop.getArticle()+PropMap.get(CurrentIteration).Prop.getName()+", ";
			}
			if (PropsInArea == 1)
			{
				CurrentIteration = (String) KeyIterator.next();
				DescribeProps = DescribeProps+PropMap.get(CurrentIteration).Prop.getArticle()+PropMap.get(CurrentIteration).Prop.getName()+".";
			}
			else if (PropsInArea>1)
			{
				CurrentIteration = (String) KeyIterator.next();
				DescribeProps = DescribeProps+"and"+PropMap.get(CurrentIteration).Prop.getArticle()+PropMap.get(CurrentIteration).Prop.getName()+".";
			}
			else{}
			return DescribeProps;
		}
		return "";
	}
	
}

package com.morethan.mundane;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


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
	
	public void addPropToArea(EnumProp propEnum)
	{
		if(PropsInArea<Area.getMaximumNumberOfProps())
		{
			Prop prop = new Prop(propEnum);
			PropMap.put(prop.Prop.getID()+PropsInArea, prop);
		}
		else{}
	}
	
	public void addItemToProp(Prop prop, EnumItem itemEnum)
	{
		if(prop.Prop.getVolumeCapacity()<prop.CurrentFilledVolume+itemEnum.getVolume()&&prop.Prop.getWeightCapacity()<prop.CurrentFilledWeight+itemEnum.getWeight())
		{
			Item item = new Item(itemEnum);
			prop.ItemMap.put(item.Item.getName(), item);
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

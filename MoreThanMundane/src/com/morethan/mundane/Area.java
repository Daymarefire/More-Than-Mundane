package com.morethan.mundane;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Area {
	
	private String DescribeProps;
	int PropsInArea = 0;
	int ExitsInArea = 0;
	int NumberOfPropsThroughArea = 0;
	EnumArea Area;
	Prop prop;
	Map<String, Exit> ExitMap = new HashMap<String, Exit>();
	Map<String, Prop> PropMap = new HashMap<String, Prop>();
	
	public Area(EnumArea area)
	{
			Area = area;
	}
	
	public boolean addPropToArea(EnumProp propEnum)
	{
		if(PropsInArea<Area.getMaximumNumberOfProps())
		{
			Prop prop = new Prop(propEnum);
			PropMap.put(prop.Prop.getID()+NumberOfPropsThroughArea, prop);
			NumberOfPropsThroughArea++;
			PropsInArea++;
			return true;
		}
		else{return false;}
	}
	
	public boolean addExitToArea(EnumExit exitEnum, int x, int y, int z)
	{
		if(PropsInArea<Area.getMaximumNumberOfProps())
		{
			Exit exit = new Exit(exitEnum, x, y, z);
			ExitMap.put(exit.Name+ExitsInArea, exit);
			ExitsInArea++;
			return true;
		}
		else{return false;}
	}
	
	public boolean addItemToProp(Prop prop, EnumItem itemEnum)
	{
		if(prop.Prop.getVolumeCapacity()<prop.CurrentFilledVolume+itemEnum.getVolume()&&prop.Prop.getWeightCapacity()<prop.CurrentFilledWeight+itemEnum.getWeight())
		{
			Item item = new Item(itemEnum);
			prop.ItemMap.put(item.Item.getName()+prop.NumberOfItemsThroughProp, item);
			prop.NumberOfItemsThroughProp++;
			prop.CurrentFilledVolume = prop.CurrentFilledVolume+item.Item.getVolume();
			prop.CurrentFilledWeight = prop.CurrentFilledWeight+item.Item.getWeight();
			return true;
		}
		else{return false;}
	}
	
	public void enterArea()
	{
		Text.printNew("You enter a "+Area.getName()+". "+Area.getDescription()+describeProps());
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
				DescribeProps = DescribeProps+PropMap.get(CurrentIteration).Prop.getArticle()+PropMap.get(CurrentIteration).Prop.getName()+",";
			}
			if (PropsInArea == 1)
			{
				CurrentIteration = (String) KeyIterator.next();
				DescribeProps = DescribeProps+PropMap.get(CurrentIteration).Prop.getArticle()+PropMap.get(CurrentIteration).Prop.getName()+".";
			}
			else if (PropsInArea>1)
			{
				CurrentIteration = (String) KeyIterator.next();
				DescribeProps = DescribeProps+" and"+PropMap.get(CurrentIteration).Prop.getArticle()+PropMap.get(CurrentIteration).Prop.getName()+".";
			}
			else{}
			return DescribeProps;
		}
		return "";
	}
	
}

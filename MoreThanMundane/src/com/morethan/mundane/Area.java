package com.morethan.mundane;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Area {

	private String listHolder;
	Area parentArea;
	EnumArea localArea;
	Map<Short, Prop> propMap = new HashMap<Short, Prop>();
	Map<Short, Container> containerMap = new HashMap<Short, Container>();
	Map<Short, Item> itemMap = new HashMap<Short, Item>();
	Map<Short, Creature> creatureMap = new HashMap<Short, Creature>();
	Map<Short, Exit> exitMap = new HashMap<Short, Exit>();
	
	public Area (EnumArea importedArea)
	{
		localArea = importedArea;
		parentArea = World.overworld;
		//AreaMap areaMap = new AreaMap (10,10);
	}
	
	public Area (EnumArea importedArea, Area originArea)
	{
		localArea = importedArea;
		parentArea = originArea;
		//AreaMap areaMap = new AreaMap (10,10);
	}
	
	public boolean createNewPropInArea(EnumProp propEnum)
	{
			Prop prop = new Prop(propEnum);
			propMap.put(prop.id, prop);
			return true;
	}
	
	public boolean createNewContainerInArea(EnumContainer containerEnum)
	{
			Container container = new Container(containerEnum);
			containerMap.put(container.id, container);
			return true;
	}

	public boolean createNewItemInArea(EnumItem itemEnum)
	{
			Item item = new Item(itemEnum);
			itemMap.put(item.id, item);
			return true;
	}
	
	public boolean createNewCreatureInArea(EnumCreature creatureEnum)
	{
			Creature creature = new Creature(creatureEnum);
			creatureMap.put(creature.id, creature);
			return true;
	}
	
	public boolean createNewExitInArea(EnumExit exitEnum, AreaMap areaMap, int x, int y)
	{
			Exit exit = new Exit(exitEnum, areaMap, x, y);
			exitMap.put(exit.id, exit);
			return true;
	}
	
	public boolean movePropToArea(Prop prop)
	{
			propMap.put(prop.id, prop);
			return true;
	}
	
	public boolean moveContainerToArea(Container container)
	{
			containerMap.put(container.id, container);
			return true;
	}

	public boolean moveItemToArea(Item item)
	{
			itemMap.put(item.id, item);
			return true;
	}
	
	public boolean moveCreatureToArea(Creature creature)
	{
			creatureMap.put(creature.id, creature);
			return true;
	}
	
	public boolean moveExitToArea(Exit exit)
	{
			exitMap.put(exit.id, exit);
			return true;
	}
	
	public void enterArea()
	{
		Text.printNew("You enter a "+localArea.getName()+". "+localArea.getDescription()+listProps()+listItems());
	}
	
	private String listProps()
	{
		if (!propMap.isEmpty())
		{
			listHolder = " There is";
			Iterator<Short> KeyIterator = propMap.keySet().iterator();
			Short CurrentIteration;
			for (int x = 0; x<propMap.size()-1&&KeyIterator.hasNext(); x++)
			{
				CurrentIteration = (Short) KeyIterator.next();
				listHolder = listHolder+propMap.get(CurrentIteration).localProp.getArticle()+propMap.get(CurrentIteration).localProp.getName()+",";
			}
			if (propMap.size() == 1)
			{
				CurrentIteration = (Short) KeyIterator.next();
				listHolder = listHolder+propMap.get(CurrentIteration).localProp.getArticle()+propMap.get(CurrentIteration).localProp.getName()+".";
			}
			else if (propMap.size()>1)
			{
				CurrentIteration = (Short) KeyIterator.next();
				listHolder = listHolder+" and"+propMap.get(CurrentIteration).localProp.getArticle()+propMap.get(CurrentIteration).localProp.getName()+".";
			}
			else{}
			return listHolder;
		}
		return "";
	}
	
	private String listItems()
	{
		if (!itemMap.isEmpty())
		{
			listHolder = " Littered across the ground there is";
			Iterator<Short> KeyIterator = itemMap.keySet().iterator();
			Short CurrentIteration;
			for (int x = 0; x<itemMap.size()-1&&KeyIterator.hasNext(); x++)
			{
				CurrentIteration = (Short) KeyIterator.next();
				listHolder = listHolder+itemMap.get(CurrentIteration).localItem.getArticle()+itemMap.get(CurrentIteration).localItem.getName()+",";
			}
			if (itemMap.size() == 1)
			{
				CurrentIteration = (Short) KeyIterator.next();
				listHolder = listHolder+itemMap.get(CurrentIteration).localItem.getArticle()+itemMap.get(CurrentIteration).localItem.getName()+".";
			}
			else if (itemMap.size()>1)
			{
				CurrentIteration = (Short) KeyIterator.next();
				listHolder = listHolder+" and"+itemMap.get(CurrentIteration).localItem.getArticle()+itemMap.get(CurrentIteration).localItem.getName()+".";
			}
			else{}
			return listHolder;
		}
		return "";
	}
}

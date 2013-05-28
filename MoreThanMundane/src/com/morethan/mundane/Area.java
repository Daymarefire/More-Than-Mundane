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
	
	public void createNewPropInArea(EnumProp propEnum)
	{
			Prop prop = new Prop(propEnum);
			propMap.put(prop.id, prop);
	}
	
	public void createNewContainerInArea(EnumContainer containerEnum)
	{
			Container container = new Container(containerEnum);
			containerMap.put(container.id, container);
	}

	public void createNewItemInArea(EnumItem itemEnum)
	{
			Item item = new Item(itemEnum);
			itemMap.put(item.id, item);
	}
	
	public void createNewCreatureInArea(EnumCreature creatureEnum)
	{
			Creature creature = new Creature(creatureEnum);
			creatureMap.put(creature.id, creature);
	}
	
	public void createNewExitInArea(EnumExit exitEnum, AreaMap areaMap, int x, int y)
	{
			Exit exit = new Exit(exitEnum, areaMap, x, y);
			exitMap.put(exit.id, exit);
	}
	
	public void movePropToArea(Prop prop)
	{
			propMap.put(prop.id, prop);
	}
	
	public void moveContainerToArea(Container container)
	{
			containerMap.put(container.id, container);
	}

	public void moveItemToArea(Item item)
	{
			itemMap.put(item.id, item);
	}
	
	public void moveCreatureToArea(Creature creature)
	{
			creatureMap.put(creature.id, creature);
			creature.currentArea = this;
	}
	
	public void moveExitToArea(Exit exit)
	{
			exitMap.put(exit.id, exit);
	}
	
	public void enterArea()
	{
		Text.printNew("You enter a "+localArea.getName()+". "+localArea.getDescription()+listProps()+listItems());
		moveCreatureToArea(Main.player);
		Main.command.fillCommandMap(Main.player.currentArea);
	}
	
	private String listProps()
	{
		if (!propMap.isEmpty())
		{
			listHolder = " There is";
			Iterator<Short> keyIterator = propMap.keySet().iterator();
			Short currentIteration;
			for (int x = 0; x<propMap.size()-1&&keyIterator.hasNext(); x++)
			{
				currentIteration = (Short) keyIterator.next();
				listHolder = listHolder+propMap.get(currentIteration).localProp.getArticle()+propMap.get(currentIteration).localProp.getName()+",";
			}
			if (propMap.size() == 1)
			{
				currentIteration = (Short) keyIterator.next();
				listHolder = listHolder+propMap.get(currentIteration).localProp.getArticle()+propMap.get(currentIteration).localProp.getName()+".";
			}
			else if (propMap.size()>1)
			{
				currentIteration = (Short) keyIterator.next();
				listHolder = listHolder+" and"+propMap.get(currentIteration).localProp.getArticle()+propMap.get(currentIteration).localProp.getName()+".";
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
			Iterator<Short> keyIterator = itemMap.keySet().iterator();
			Short currentIteration;
			for (int x = 0; x<itemMap.size()-1&&keyIterator.hasNext(); x++)
			{
				currentIteration = (Short) keyIterator.next();
				listHolder = listHolder+itemMap.get(currentIteration).localItem.getArticle()+itemMap.get(currentIteration).localItem.getName()+",";
			}
			if (itemMap.size() == 1)
			{
				currentIteration = (Short) keyIterator.next();
				listHolder = listHolder+itemMap.get(currentIteration).localItem.getArticle()+itemMap.get(currentIteration).localItem.getName()+".";
			}
			else if (itemMap.size()>1)
			{
				currentIteration = (Short) keyIterator.next();
				listHolder = listHolder+" and"+itemMap.get(currentIteration).localItem.getArticle()+itemMap.get(currentIteration).localItem.getName()+".";
			}
			else{}
			return listHolder;
		}
		return "";
	}
}

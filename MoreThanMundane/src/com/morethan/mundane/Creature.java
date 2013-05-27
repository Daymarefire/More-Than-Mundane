package com.morethan.mundane;

import java.util.HashMap;
import java.util.Map;

public class Creature {

	short id;
	String creatureType;
	EnumCreature localCreature;
	Map<Short, Item> inventory = new HashMap<Short, Item>();
	
	public Creature (EnumCreature importedCreature)
	{
		if (importedCreature.getType().equals(creatureType))
		{
			localCreature = importedCreature;
			id = Main.uniqueId.create();
		}
		else{}
	}
	
	public boolean moveItemToInventory (Item item)
	{
		inventory.put(item.id, item);
		return true;
	}
}

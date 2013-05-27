package com.morethan.mundane;

public class Item {
	
	short id;
	EnumItem localItem;
	
	public Item (EnumItem importedItem)
	{
		localItem = importedItem;
		id = Main.uniqueId.create();
	}
	
}

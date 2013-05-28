package com.morethan.mundane;

public class Item extends UniqueIDObject{
	
	EnumItem localItem;
	
	public Item (EnumItem importedItem)
	{
		localItem = importedItem;
		id = Main.uniqueId.create();
		script = localItem.getScript();
	}

	String getName() 
	{
		return localItem.getName();
	}
	
}

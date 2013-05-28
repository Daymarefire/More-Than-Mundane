package com.morethan.mundane;

public class Container extends UniqueIDObject{

	EnumContainer localContainer;
	
	public Container (EnumContainer importedContainer)
	{
		localContainer = importedContainer;
		id = Main.uniqueId.create();
	}

	String getName() 
	{
		return localContainer.getName();
	}

}

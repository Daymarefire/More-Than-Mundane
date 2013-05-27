package com.morethan.mundane;

public class Container {

	short id;
	EnumContainer localContainer;
	
	public Container (EnumContainer importedContainer)
	{
		localContainer = importedContainer;
		id = Main.uniqueId.create();
	}

}

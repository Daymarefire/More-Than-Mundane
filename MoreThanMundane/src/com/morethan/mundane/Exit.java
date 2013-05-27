package com.morethan.mundane;

public class Exit {
	
	short id;
	int DestinationX;
	int DestinationY;
	AreaMap destinationAreaMap;
	EnumExit localExit;
	
	public Exit (EnumExit importedExit, AreaMap areaMap, int exitDestinationX, int exitDestinationY) //For situations where the destination will be in a different areaMap from the source Area
	{
		localExit = importedExit;
		id = Main.uniqueId.create();
		DestinationX = exitDestinationX;
		DestinationY = exitDestinationY;
		destinationAreaMap = areaMap;
	}

}

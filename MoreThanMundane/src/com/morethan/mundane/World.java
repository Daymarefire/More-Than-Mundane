package com.morethan.mundane;

public class World {

	static Area overworld; //A dummy Area referenced as the parentArea of all Areas in the World AreaMap below
	
	public World ()
	{
	new AreaMap (100,100);
	AreaMap.areaMap[0][0] = new Area (EnumArea.FOREST_LIT, overworld);
	}

}

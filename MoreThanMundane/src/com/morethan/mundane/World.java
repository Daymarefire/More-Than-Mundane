package com.morethan.mundane;

public class World {

	Area[][][] ExteriorWorld = new Area[10][10][1];
	
	public World()
	{
		ExteriorWorld[0][0][0] = new Area(EnumArea.FOREST_LIT);
	}
	
}

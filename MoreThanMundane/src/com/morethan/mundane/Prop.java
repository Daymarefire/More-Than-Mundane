package com.morethan.mundane;

import java.util.HashMap;
import java.util.Map;

public class Prop {
	
	Double CurrentFilledVolume;
	Double CurrentFilledWeight;
	int NumberOfItemsThroughProp = 0;
	EnumProp Prop;
	Map<String, Item> ItemMap = new HashMap<String, Item>();

	public Prop(EnumProp prop)
	{
			Prop = prop;
	}
}

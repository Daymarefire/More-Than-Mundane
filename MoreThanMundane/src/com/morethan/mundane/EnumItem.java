package com.morethan.mundane;

public enum EnumItem {

	STICK("Stick", 1d, 1d, "");
	
	String n;
	Double v;
	Double w;
	String d;
	
	EnumItem(String Name, Double Volume, Double Weight, String Description) {
		
		n = Name;
		v = Volume;
		w = Weight;
		d = Description;
		
	}
	
	String getName()
	{
		return n;
	}
	
	Double getVolume()
	{
		return v;
	}
	
	Double getWeight()
	{
		return w;
	}
	
	String getDescription()
	{
		return d;
	}
}

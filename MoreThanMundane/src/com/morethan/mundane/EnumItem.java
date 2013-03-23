package com.morethan.mundane;

public enum EnumItem {

	STICK("STK","Stick", 1d, 1d, "");
	
	String id;
	String n;
	Double v;
	Double w;
	String d;
	
	EnumItem(String ID, String Name, Double Volume, Double Weight, String Description) {
		
		id = ID;
		n = Name;
		v = Volume;
		w = Weight;
		d = Description;
		
	}
	
	String getID()
	{
		return id;
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

package com.textadventure.game;

public enum EnumProp {

	WOODEN_TABLE("Wooden Table", "Wood Table", "Table", true, true, (Boolean) null, 10, 10, "", "");
	
	private String n1;
	private String n2;
	private String n3;
	private boolean c;
	private boolean t;
	private boolean o;
	private int v;
	private int w;
	private String d;
	private String dd;
	
	EnumProp(String Name, String AlternateName, String AlternateName2, boolean Container, boolean TransparentContainer, boolean Open, int VolumeCapacity, int WeightCapacity, String Description, String DetailedDescription) {
		
		n1 = Name;
		n2 = AlternateName;
		n3 = AlternateName2;
		c = Container;
		t = TransparentContainer;
		o = Open;
		v = VolumeCapacity;
		w = WeightCapacity;
		d = Description;
		dd = DetailedDescription;
		
	}
	
	String getName()
	{
		return n1;
	}
	
	String getAlternateName()
	{
		return n2;
	}
	
	String getAlternateName2()
	{
		return n3;
	}
	
	boolean isContainer()
	{
		return c;
	}
	
	boolean isTransparentContainer()
	{
		return t;
	}
	
	boolean isOpen()
	{
		return o;
	}
	
	int getVolumeCapacity()
	{
		return v;
	}
	
	int getWeightCapacity()
	{
		return w;
	}
	
	String getDescription()
	{
		return d;
	}
	
	String getDetailedDescription()
	{
		return dd;
	}
}

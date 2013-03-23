package com.morethan.mundane;

public enum EnumProp {

	CHEST_WOODEN("CHEST_WOOD", "Wooden Chest", "Chest", "Box", " a ", true, false, false, 10d, 10d, ""),
	TORTURE_RACK("TORTURE_RACK1", "Torture Rack", "Torture Device", "Rack", " a ", false, false, false, 0d, 0d, ""),
	WALL_CHAINS("WALL_CHAIN", "Chains on the Wall", "Chain", "Wall Chain", " some ", false, false, false, 0d, 0d, ""),
	TABLE_WOODEN("TABLE_WOOD", "Wooden Table", "Wood Table", "Table", " a ", true, true, true, 10d, 10d, "");
	
	private String id;
	private String n1;
	private String n2;
	private String n3;
	private String a;
	private boolean c;
	private boolean t;
	private boolean o;
	private Double v;
	private Double w;
	private String d;
	
	EnumProp(String ID, String Name, String AlternateName, String AlternateName2, String IndefiniteArticle, boolean Container, boolean TransparentContainer, boolean Open, Double VolumeCapacity, Double WeightCapacity, String Description) {
		
		id = ID;
		n1 = Name;
		n2 = AlternateName;
		n3 = AlternateName2;
		a = IndefiniteArticle;
		c = Container;
		t = TransparentContainer;
		o = Open;
		v = VolumeCapacity;
		w = WeightCapacity;
		d = Description;
		
	}
	
	String getID()
	{
		return id;
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
	
	String getArticle()
	{
		return a;
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
	
	Double getVolumeCapacity()
	{
		return v;
	}
	
	Double getWeightCapacity()
	{
		return w;
	}
	
	String getDescription()
	{
		return d;
	}
}

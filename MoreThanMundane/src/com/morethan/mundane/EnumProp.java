package com.morethan.mundane;

public enum EnumProp {

	WOODEN_TABLE("WOOD_TBL", "Wooden Table", "Wood Table", "Table", " a ", true, true, (Boolean) null, 10d, 10d, "");
	
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

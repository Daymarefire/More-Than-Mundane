package com.textadventure.game;

public enum EnumProp {

	WOODEN_TABLE("Wooden Table", "Wood Table", "Table", " a ", true, true, (Boolean) null, 10, 10, "");
	
	private String n1;
	private String n2;
	private String n3;
	private String a;
	private boolean c;
	private boolean t;
	private boolean o;
	private int v;
	private int w;
	private String d;
	
	EnumProp(String Name, String AlternateName, String AlternateName2, String IndefiniteArticle, boolean Container, boolean TransparentContainer, boolean Open, int VolumeCapacity, int WeightCapacity, String Description) {
		
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
}

package com.morethan.mundane;

public class Prop extends UniqueIDObject{
	
	EnumProp localProp;
	
	public Prop (EnumProp importedProp)
	{
		localProp = importedProp;
		id = Main.uniqueId.create();
		script = localProp.getScript();
	}
	
	public String getName()
	{
		return localProp.getName();
	}
	
}

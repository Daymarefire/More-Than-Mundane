package com.morethan.mundane;

public class Prop {
	
	short id;
	EnumProp localProp;
	
	Prop (EnumProp importedProp)
	{
		localProp = importedProp;
		id = Main.uniqueId.create();
	}
}

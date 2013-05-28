package com.morethan.mundane;
//Wrapper data type for all objects which gain a UniqueID from the UniqueID Class
//Used for casts in the Command Class which requires a single object to cast which will be guaranteed to contain the script object
public abstract class UniqueIDObject {
	
	short id;
	Script script;
	abstract String getName();
	
}

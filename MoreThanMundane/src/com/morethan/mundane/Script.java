package com.morethan.mundane;

public abstract class Script {
	
	abstract boolean isApplicable(String string);
	abstract String run(String string);
	
}

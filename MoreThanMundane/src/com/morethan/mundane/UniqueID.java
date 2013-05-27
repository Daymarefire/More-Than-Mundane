package com.morethan.mundane;

public class UniqueID {

	short lastIDSent = 0;
	
	short create ()
	{
		lastIDSent++;
		return lastIDSent;
	}

}

package com.textadventure.game;

public class PropWoodenTable implements Prop
{

	public String name() {
		return "Wooden Table";
	}
	
	public String alternateName1() {
		return "Wood Table";
	}
	
	public String alternateName2() {
		return "Table";
	}
	
	public String description() {
		return "a solid wooden table.";
	}
	
	public String detailedDescription() {
		return "a solid wooden table with thick legs. Various graffiti cover the surface.";
	}

	public boolean isContainer() {
		return true;
	}

	public boolean isTransparentContainer() {
		return true;
	}

	public boolean isOpen() {
		return (Boolean) null;
	}

	public int volumeCapacity() {
		return 10;
	}

	public int weightCapacity() {
		return 10;
	}

}

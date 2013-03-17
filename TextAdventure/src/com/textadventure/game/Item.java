package com.textadventure.game;

public interface Item {

	public String name();
	public String alternateName();
	public String description();
	public String detailedDescription();
	public String weaponType();
	public boolean isSkilledWeapon();
	public boolean isUseableWeapon();
	public boolean isUnique();
	public int damage();
	public int durability();
	public int resistance();
	public int quality();
	public int volume();
	public int weight();
	
}

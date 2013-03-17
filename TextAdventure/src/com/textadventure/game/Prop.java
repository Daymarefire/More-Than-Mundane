package com.textadventure.game;

public interface Prop {

	public String name();//Name of prop
	public String alternateName1();//possible alternateName, add up to 3 as alternateName1, alternateName2, and alternateName3
	public String description();//short description of prop for when it is seen in a room
	public String detailedDescription();//long description for when viewed with examine
	public boolean isContainer();//Whether a prop can contain items
	public boolean isTransparentContainer();//If the Prop is a container whether the contents are visible, in the case of a opening container this indicates the closed state
	public boolean isOpen();//If the prop is open or closed, always null for props that do not open or close
	public int volumeCapacity();//volume capacity, 0 indicates a non container, -1 indicates infinite volume
	public int weightCapacity();//weight capacity, 0 indicates a non container, -1 indicates infinite weight
	
}

package com.morethan.mundane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Command {

	Map<Short, UniqueIDObject> commandMap = new HashMap<Short, UniqueIDObject>();
	
	public void processCommand(String command)
	{
		Iterator<Short> keyIterator = commandMap.keySet().iterator();
		Short currentIteration;
		List<Short> applicableScriptIDs = new ArrayList<Short>();
		while (keyIterator.hasNext())
		{
			currentIteration = (Short) keyIterator.next();
			if (((UniqueIDObject) commandMap.get(currentIteration)).script.isApplicable(command))
				{
				applicableScriptIDs.add(currentIteration);
				}
			else{}
		}
		if (applicableScriptIDs.size() == 1)
		{
			((UniqueIDObject) commandMap.get(applicableScriptIDs.get(0))).script.run(command);
		}
		else if (applicableScriptIDs.size() > 1)
		{
			boolean allReferencesDifferentiable = true;
			for (int x = 1; x < applicableScriptIDs.size()-1 && allReferencesDifferentiable; x++)
			{
				if (((UniqueIDObject) commandMap.get(applicableScriptIDs.get(0))).getName().equals((((UniqueIDObject) commandMap.get(applicableScriptIDs.get(x))).getName())))
					{
						allReferencesDifferentiable = false;
					}
				else{}
			}
			if (allReferencesDifferentiable)
			{
				Text.printNew("You need to be more specific.");
			}
			else if (!allReferencesDifferentiable)
			{
				Text.printNew("There are several identical objects fitting that description.");
			}
		}
		else{}
	}
	
	public void fillCommandMap(Area area)
	{
		Iterator<Short> keyIterator;
		Short currentIteration;
		if (!area.propMap.isEmpty())
		{
			keyIterator = area.propMap.keySet().iterator();
			while (keyIterator.hasNext())
			{
				currentIteration = (Short) keyIterator.next();
				commandMap.put(currentIteration, area.propMap.get(currentIteration));
			}
		}
	}
	
	public void clearCommandMap()
	{
		commandMap.clear();
	}	
}
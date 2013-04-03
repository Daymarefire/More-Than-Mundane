package com.morethan.mundane;

import java.util.Random;

public class PlayerSkills {

	int Clubs;
	int Dodge;
	int Swords;
	
	public PlayerSkills()
	{
		Random rand = new Random();
		Clubs = rand.nextInt(5)+1;
		Dodge = rand.nextInt(5)+1;
		Swords = rand.nextInt(5)+1;
	}
	
	public int getSkillLevel(int skill)
	{
		return skill;
	}
	
	public int getSkillExperience(int skill)
	{
		return skill;
	}
	
	public void addExperience(int skill, int exp)
	{
		skill=skill+exp;
	}
	
}

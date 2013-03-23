package com.morethan.mundane;

import java.util.Random;

public class Player {

	int PlayerLocationX = 0;
	int PlayerLocationY = 0;
	int PlayerLocationZ = 0;
	int Strength;
	int Finesse;
	int Speed;
	int Knowledge;
	int Spirit;
	int Health;
	int CurrentHealth;
	int Mana;
	int CurrentMana;
	int Zeal;
	int CurrentZeal;
	int Fatigue;
	int CurrentFatigue;
	
	public Player()
	{
		Random rand = new Random();
		Strength = rand.nextInt(5)+1;
		Finesse = rand.nextInt(5)+1;
		Speed = rand.nextInt(5)+1;
		Knowledge = rand.nextInt(5)+1;
		Spirit = rand.nextInt(5)+1;
		Health = Strength*2;
		CurrentHealth = Health;
		Mana = Knowledge*2;
		CurrentMana = Mana;
		Zeal = Spirit*2;
		CurrentZeal = Zeal;
		Fatigue = Finesse*2;
		PlayerSkills skills = new PlayerSkills();
	}
	
}

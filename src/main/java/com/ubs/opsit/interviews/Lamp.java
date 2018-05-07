package com.ubs.opsit.interviews;

public class Lamp {
	
	
	private final char color;
	private char currentColor='O';
	
	public Lamp(char color)
	{
		this.color=color;
	}
	
	public void putOn()
	{
		currentColor=this.color;
	}
	public void putOff()
	{
		currentColor='O';
	}


	public String toString() {
		return ""+currentColor;
	}
	
}

package abst.model;

import java.util.ArrayList;

import javax.swing.*;

public class Mammals extends FluffyThings 
{
	public Mammals()
	{
		super();
		this.setSize("Large");
		this.setGroup("Large Mammals");
		this.setGoodnessScale(5.0);
		this.setIsCute(false);
	}
	
	public String name(String name) 
	{		
		name = "Large Mammals";
		
		return name;
	}

	public int speed()
	{		
		return 50;
	}

	public boolean isMoving() 
	{
		return true;
	}

	public void moveThing(int speed) 
	{
		
		
	}
	
	public String toString()
	{
		String description = "This is a " + this.getClass().getName() + " and has a speed of: " + speed();
		
		return description;
	}
	
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof MovingThing)
		{
			if(this.speed() > ((MovingThing) compared).speed())
			{
				comparedValue = 1;
			}
			else if(this.speed() < ((MovingThing) compared).speed())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		
		return comparedValue;
	}
	
	
	
}

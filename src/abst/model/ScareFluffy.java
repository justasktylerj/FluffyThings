package abst.model;

import javax.swing.*;

public class ScareFluffy extends FluffyThings 
{
	public ScareFluffy()
	{
		super();
		
		this.setGroup("Spiders");
		this.setSize("Tiny");
		this.setGoodnessScale(0.1);
		this.setIsCute(false);
	}
	
	public String name(String name) 
	{		
		name = "Spiders";
		
		return name;
	}

	public int speed()
	{		
		return 1;
	}

	public boolean isMoving() 
	{
		return false;
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

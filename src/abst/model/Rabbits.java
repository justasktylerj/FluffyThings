package abst.model;

import javax.swing.*;

public class Rabbits extends FluffyThings
{

	public Rabbits()
	{
		super();
		
		this.setGroup("Rabbits");
		this.setSize("Small");
		this.setGoodnessScale(10.0);
		this.setIsCute(true);
	}
	
	public String name(String name) 
	{		
		name = "Rabbit";
		
		return name;
	}

	public int speed()
	{		
		return 45;
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

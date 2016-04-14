package abst.controller;

import java.util.ArrayList;
import abst.model.*;

public class InhertitanceController 
{
	public InhertitanceController()
	{
		makeMovingList();
	}
	public String MovingSpeed ()
	{
		String moving = "";
		for (MovingThing current : movingThings)
		{
			if (current.isMoving() == true)
			{
				moving.concat(current.name(moving) + " is moving at a speed of" + current.speed() + "\n");
			}
		}
		return moving;
	}
	private ArrayList <MovingThing> movingThings;
	
	private void makeMovingList()
	{
		movingThings.add(new Mammals());
		movingThings.add(new ScareFluffy());
		movingThings.add(new Rabbits());
	}
	
	public void start()
	{
		
	}
	
	public void showSpeed()
	{
		 
	}
	
	public void swap(int firstLocation, int secondLocation)
	{
		MovingThing temp = movingThings.get(firstLocation);
		movingThings.set(firstLocation, movingThings.get(secondLocation));
		movingThings.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < movingThings.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (movingThings.get(innerLoop-1).compareTo(movingThings.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
		}
	}
}

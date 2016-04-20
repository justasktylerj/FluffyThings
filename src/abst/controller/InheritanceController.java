package abst.controller;

import java.util.ArrayList;
import abst.model.*;
import abst.view.*;
public class InheritanceController 
{
	public InheritanceController()
	{
		this.movingThings = new ArrayList<MovingThing>();
	}
	
	private ArrayList <MovingThing> movingThings;
	
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
	
	private void makeMovingList()
	{
		movingThings.add(new Mammals());
		movingThings.add(new ScareFluffy());
		movingThings.add(new Rabbits());
	}
	
	public void start()
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
	
	public void quickSort(int low, int high)
	{
		if(low < high)
		{
			int midPoint = partition(low, high);
			quickSort(low, midPoint-1);
			quickSort(midPoint+1, high);
		}
	}
	
	
	private int partition(int low, int high)
	{
		int partition = 0;
		MovingThing pivot = movingThings.get(high);
		int position = low;
		for (int spot = low; spot < high - 1; spot++)
		{
			if (movingThings.get(spot).compareTo(pivot) <= 0)
			{
				swap (position, spot);
				position++;
			}
		}
		swap(position, high);
		
		return position;
	}
}

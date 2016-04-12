package abst.controller;

import java.util.ArrayList;
import abst.model.*;

public class InhertitanceController 
{
	public InhertitanceController()
	{
		makeSillyList();
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
	public void start()
	{
		
	}
	 public String showSpeed()
	 {
		 
	 }
	private void makeMovingList()
	{
		movingThings.add(new Mammals());
		movingThings.add(new ScareFluffy());
		movingThings.add(new Rabbits());
	}
}

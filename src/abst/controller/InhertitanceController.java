package abst.controller;

import java.util.ArrayList;
import abst.model.*;

public class InhertitanceController 
{
	private ArrayList<FluffySilly> fluffySilly;
	
	public String showFluffyLevels()
	{
		String FluffyLevels = "";
		for(FluffySilly currentFluffy : fluffySilly)
		{
			fluffyLevels.concat("This is a " + currentFluffy.toString() + " and has a fluffiness level of " + currentFluffy.fluffinessLevel() + "\n");
		}
		
		return fluffylevels;
	}
	
	private void makeFluffyList()
	{
		fluffyThings.add(new Mammals());
		fluffyThings.add(new ScareFluffy());
	}
}

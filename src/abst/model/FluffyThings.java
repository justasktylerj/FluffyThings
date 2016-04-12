package abst.model;

public abstract class FluffyThings implements MovingThing, Comparable
{
	private String group;
	private String size;
	private double goodnessScale;
	private boolean isCute;
	
	
	public String getGroup() 
	{
		return group;
	}
	public void setGroup(String group) 
	{
		this.group = group;
	}
	public String getSize() 
	{
		return size;
	}
	public void setSize(String size) 
	{
		this.size = size;
	}
	public double getGoodnessScale() 
	{
		return goodnessScale;
	}
	public void setGoodnessScale(double d) 
	{
		this.goodnessScale = d;
	}
	public boolean getIsCute() 
	{
		return isCute;
	}
	public void setIsCute(boolean isCute) 
	{
		this.isCute = isCute;
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

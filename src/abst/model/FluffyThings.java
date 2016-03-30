package abst.model;

public abstract class FluffyThings 
{
	public String group;
	public String size;
	public double goodnessScale;
	
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
	
	
}

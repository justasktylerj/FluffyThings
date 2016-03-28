package abst.model;

public abstract class FluffyThings 
{
	private String group;
	private String size;
	private Long goodnessScale;
	
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
	public Long getGoodnessScale() 
	{
		return goodnessScale;
	}
	public void setGoodnessScale(Long goodnessScale) 
	{
		this.goodnessScale = goodnessScale;
	}
	
}

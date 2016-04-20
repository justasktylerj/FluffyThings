package abst.view;

import abst.controller.InheritanceController;
import abst.view.InheritancePanel;

public class InheritanceFrame extends JFrame
{
	private InheritanceController baseController;
	private InheritancePanel basePanel;
	
	public InheritanceFrame(InheritanceController baseController)
	{
		this.baseController = baseController;
		basePanel = new Inheritance(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);  //installs the panel in the frame
		this.setSize(500,500);
		this.setTitle("Rock, paper, scissors!"); // find a good size for app
		this.setResizable(false); //can't change size of window
		this.setVisible(true);  //must be last line of setupFrame
	}
	
	public InheritanceController getBaseController()
	{
		return baseController;
	}
}




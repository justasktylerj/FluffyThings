package abst.view;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import abst.controller.InheritanceController;
import abst.model.MovingThing;

public class InheritancePanel extends JPanel
{
private InheritanceController baseController;
	private JButton sortButton;
	private JTextArea textArea;
	private SpringLayout baseLayout;
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				textArea.setText(baseController.MovingSpeed());
				
				String temp = "the sorted contents are: \n";
				for (MovingThing current : baseController.getMovingThings())
				{
					 temp += current.toString() + "\n";
				}
				textArea.setText(temp);
			}
		});
	}
}

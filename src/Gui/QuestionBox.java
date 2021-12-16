package Gui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class QuestionBox extends JButton {
	private boolean isOpened;
	public QuestionBox(int i, int boxSize){
		isOpened= false;
		setText(""+i);
		 setPreferredSize(new Dimension(2600/boxSize, 300));
	//	 System.out.println("size: "+2600/boxSize +", "+boxSize );
		 setFont(new Font("Arial", Font.PLAIN, 40));
		 setBackground(Color.cyan);
		 addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(Color.gray);
			}
			 
		 });
	}
}

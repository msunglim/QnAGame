package Page;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Gui.GameManager;
import Gui.LinearLayoutPanel;
import Gui.QuestionBox;

public class SelectPanel extends JPanel {
	private MyPanel mp;
	SelectPanel(MyPanel mp) {
//		System.out.println(GameManager.getNumberOfPlayer());
//
//		System.out.println(GameManager.getQuestionList().length);
//		System.out.println(GameManager.getItemList().length);
		
		LinearLayoutPanel firstrow = new LinearLayoutPanel(1500, 300);

		LinearLayoutPanel secondrow = new LinearLayoutPanel(1500, 300);
		for (int i = 0; i < GameManager.getQuestionList().length + GameManager.getItemList().length; i++) {
			
			QuestionBox qb;
			if (i < (GameManager.getQuestionList().length + GameManager.getItemList().length) / 2 ) {
				qb = new QuestionBox(i+1,
						GameManager.getQuestionList().length + GameManager.getItemList().length);
				firstrow.add(qb);
			}else {
				qb = new QuestionBox(i+1,
						GameManager.getQuestionList().length + GameManager.getItemList().length +1);
				secondrow.add(qb);
			}
			final int index = i;
			qb.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					mp.moveToQuestionPanel(index);
				}
				
			});
		}
		add(firstrow);
		add(secondrow);
	}
}

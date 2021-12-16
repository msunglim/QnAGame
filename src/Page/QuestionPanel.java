package Page;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import Gui.GameManager;
import Gui.LinearLayoutPanel;
public class QuestionPanel extends LinearLayoutPanel{

	QuestionPanel(int w, int h,int i, MyPanel mp) {
		super(w, h);
		JLabel question = new JLabel(GameManager.getAllTitle()[i]);
		//System.out.println(GameManager.getQuestionList()[i]);
		
		question.setFont(new Font("Calibri", Font.BOLD, 100));
		
		addAsRow(question,200);
		JLabel answer = new JLabel(GameManager.getAllDescription()[i]);
		//System.out.println(GameManager.getQuestionList()[i]);

		answer.setFont(new Font("Calibri", Font.BOLD, 60));
		addAsRow(answer, 60);
		
		JButton correct = new JButton("correct!");
		correct.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//give point to the player who answers correctly and set next player as curr.
				GameManager.getPlayerList()[GameManager.getCurrentPlayerIndex()].setPoint(10+GameManager.getPlayerList()[GameManager.getCurrentPlayerIndex()].getPoint());
				GameManager.nextPlayer();

				mp.PlayerPanelIncrease();
				mp.moveToSelectPanel();
			}
			
		});
		add(correct);
		
		JButton wrong = new JButton("Wrong!");
		wrong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//give point to the player who answers correctly and set next player as curr.
				GameManager.getPlayerList()[GameManager.getCurrentPlayerIndex()].setPoint(GameManager.getPlayerList()[GameManager.getCurrentPlayerIndex()].getPoint());
				GameManager.nextPlayer();
				
				mp.PlayerPanelRefresh();
//				mp.moveToSelectPanel();
			
			}
			
		});
		add(wrong);
	}

}

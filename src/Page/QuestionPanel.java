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
		//gamemanager.getitemlist.contains(above element) then set panel properly.
		question.setFont(new Font("Calibri", Font.BOLD, 100));
		
		addAsRow(question,200);
		JLabel answer = new JLabel(GameManager.getAllDescription()[i]);
		

		answer.setFont(new Font("Calibri", Font.BOLD, 60));
		addAsRow(answer, 60);
		
		int currPlayer = GameManager.getCurrentPlayerIndex();
		System.out.println("start currplayer:"+currPlayer);
		JButton correct = new JButton("Correct!");
		correct.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//give point to the player who answers correctly and set next player as curr.
				GameManager.getPlayerList()[GameManager.getCurrentPlayerIndex()].setPoint(10+GameManager.getPlayerList()[GameManager.getCurrentPlayerIndex()].getPoint());
				
				mp.PlayerPanelPointRefresh();
				int mostCurr = GameManager.getCurrentPlayerIndex();
				GameManager.setNextPlayer(currPlayer);
				mp.PlayerPanelRefresh(mostCurr, GameManager.getCurrentPlayerIndex());
				//System.out.println("next index" + GameManager.getNextPlayerIndex());
				
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
				
				
				GameManager.setNextPlayer(GameManager.getCurrentPlayerIndex());
				mp.PlayerPanelRefresh(GameManager.getPreviousPlayerIndex(),GameManager.getCurrentPlayerIndex());
				
//				mp.moveToSelectPanel();
			
			}
			
		});
		add(wrong);
	}

}

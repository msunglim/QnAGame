package Page;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Gui.GameManager;
import Gui.LinearLayoutPanel;
public class PlayerPanel extends LinearLayoutPanel {
	LinearLayoutPanel[] playerPanel;
	PlayerPanel(int w, int h){
		super(w,h);
		playerPanel = new LinearLayoutPanel[GameManager.getNumberOfPlayer()];
		for (int i = 0; i < GameManager.getNumberOfPlayer(); i++) {
			LinearLayoutPanel player = new LinearLayoutPanel(1500 / (GameManager.getNumberOfPlayer() + 1), 90);
			int innerw = 1500 / (GameManager.getNumberOfPlayer() + 1);
			player.addAsRow(new JLabel("Player" + (1 + i)));
			player.addAsRow(new JLabel("" + GameManager.getPlayerList()[i].getPoint()));
			player.setBackground(Color.white);
			player.setBorder(BorderFactory.createLineBorder(Color.black));
			
			playerPanel[i]= player;
			add(player);
		}
		playerPanel[GameManager.getCurrentPlayerIndex()].setBackground(Color.pink);
		playerPanel[GameManager.getCurrentPlayerIndex()].setBorder(BorderFactory.createLineBorder(Color.red));
	}
	
	
	//a: old index
	//b: new index
	public void refresh(int a , int b) {
//		int prev = GameManager.getPreviousPlayerIndex();
//		System.out.println("prev"+ prev);
//		playerPanel[prev].setBackground(Color.white);
//		playerPanel[prev].setBorder(BorderFactory.createLineBorder(Color.black));
//		
//		
		//int curr =GameManager.getCurrentPlayerIndex();
		
		playerPanel[a].setBackground(Color.white);
		playerPanel[a].setBorder(BorderFactory.createLineBorder(Color.black));
//		
		//int next =GameManager.getNextPlayerIndex();
		playerPanel[b].setBackground(Color.pink);
		playerPanel[b].setBorder(BorderFactory.createLineBorder(Color.red));
//		
		
	}
	public void refreshPoint() {
//		int prev = GameManager.getPreviousPlayerIndex();
//
//		JPanel p = (JPanel) playerPanel[prev].getComponent(1);
//		JLabel l = (JLabel) p.getComponent(0);
//		l.setText(""+GameManager.getPlayerList()[prev].getPoint());
//		
		
		int curr = GameManager.getCurrentPlayerIndex();

		JPanel p2 = (JPanel) playerPanel[curr].getComponent(1);
		JLabel l2 = (JLabel) p2.getComponent(0);
		l2.setText(""+GameManager.getPlayerList()[curr].getPoint());
		

		playerPanel[curr].setBackground(Color.white);
		playerPanel[curr].setBorder(BorderFactory.createLineBorder(Color.black));
		
	}
}

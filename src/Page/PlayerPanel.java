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
	public void refresh() {
		int prev = GameManager.getPreviousPlayerIndex();

		playerPanel[prev].setBackground(Color.white);
		playerPanel[prev].setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		int curr =GameManager.getCurrentPlayerIndex();

		playerPanel[curr].setBackground(Color.pink);
		playerPanel[curr].setBorder(BorderFactory.createLineBorder(Color.red));
		
		
	}
	public void increasePoint() {
		int prev = GameManager.getPreviousPlayerIndex();

		JPanel p = (JPanel) playerPanel[prev].getComponent(1);
		JLabel l = (JLabel) p.getComponent(0);
		l.setText(""+GameManager.getPlayerList()[prev].getPoint());
		
		
	}
}

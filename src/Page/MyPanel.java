package Page;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private SettingPanel sp;
	private SelectPanel slp;
	private PlayerPanel pp;
	private QuestionPanel qp;

	public MyPanel() {
		super();

		setLayout(new BorderLayout());
		// setPreferredSize(new Dimension(1000, 1000));

		setBackground(Color.white);
		sp = new SettingPanel(this);
		add(sp, BorderLayout.CENTER);

	}

	public void PlayerPanelRefresh() {
		pp.refresh();
	}
	public void PlayerPanelIncrease() {
		pp.increasePoint();
	}
	public void moveToSelectPanel() {
		//removeAllPanel();
		
		if (pp == null) {
			pp = new PlayerPanel(1500, 100);
			remove(getComponent(0));
			add(pp, BorderLayout.NORTH);
		}else {
			remove(getComponent(1));
			PlayerPanelRefresh();
		}
		
		if (slp == null) {
			slp = new SelectPanel(this);
		}
		add(slp, BorderLayout.CENTER);
		
		revalidate();
		repaint();
	}
	

	public void moveToQuestionPanel(int i) {
		remove(getComponent(1));

		qp = new QuestionPanel(1500, 1000, i, this);
	
		add(qp, BorderLayout.CENTER);
		revalidate();
		repaint();
	}
}

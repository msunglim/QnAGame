import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	private SettingPanel sp;
	private SelectPanel slp;
	MyPanel(){
		super();

		setLayout(new BorderLayout());
		//setPreferredSize(new Dimension(1000, 1000));

		setBackground(Color.white);
		sp = new SettingPanel(this);
		add(sp, BorderLayout.CENTER);
	
	}
	public void moveToSelectPanel() {
		remove(sp);
	
		slp = new SelectPanel();
		add(slp, BorderLayout.CENTER);
		revalidate();
	}

}

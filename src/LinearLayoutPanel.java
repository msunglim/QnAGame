import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class LinearLayoutPanel extends JPanel{
	private int w,h;
	LinearLayoutPanel(int w, int h){
		this.w = w;
		this.h = h;

		setBackground(Color.white);	
		setPreferredSize(new Dimension(w,h));
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	public void addAsRow(Component c) {
		JPanel p =  new JPanel();
		p.setPreferredSize(new Dimension(w,30));
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.add(c);
		add(p);
	}
	
}

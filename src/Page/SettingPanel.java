package Page;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Gui.GameManager;
import Gui.LinearLayoutPanel;
import Panel.ItemSettingPanel;
import Panel.QnASettingPanel;

public class SettingPanel extends JPanel{
	private int w;
	private MyPanel mp;
	SettingPanel(MyPanel mp){
		this.mp = mp;
		w= 1500;

		setBackground(Color.white);
		LinearLayoutPanel npp = new LinearLayoutPanel(w,50);
		
		JLabel numberOfPlayerL = new JLabel("Type Number Of Players");
		JTextField numberOfPlayerTF = new JTextField(5);
		npp.add(numberOfPlayerL);
		npp.add(numberOfPlayerTF);
		add(npp);

		QnASettingPanel qsp = new QnASettingPanel();
		add(qsp);
		
		ItemSettingPanel isp = new ItemSettingPanel(w, 40);
		add(isp);
		
		
		JButton confirm = new JButton("Confirm");
		confirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int numberOfPlayer = Integer.parseInt(numberOfPlayerTF.getText());
				GameManager.setNumberOfPlayer(numberOfPlayer);
				GameManager.setPlayerList();
				qsp.setGMQuestionList();
				isp.setGMItemList();
				mp.moveToSelectPanel();
				GameManager.setAllTD();
//				System.out.println("number of player: "+numberOfPlayer);
//				System.out.println("number of question: "+qsp.getNumberOfQuestion());
//				System.out.println("number of checkedbox: "+isp.getNumberOfCheckedbox());
			}
			
		});
		add(confirm);
		
	}
}

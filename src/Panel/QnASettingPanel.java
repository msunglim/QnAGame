package Panel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Gui.GameManager;
import Gui.LinearLayoutPanel;

public class QnASettingPanel extends JPanel {
	JTextField [] questionList = new JTextField[13];
	JTextField [] answerList = new JTextField[13];
	public QnASettingPanel() {
		LinearLayoutPanel qp = new LinearLayoutPanel(750,500);
		LinearLayoutPanel ap = new LinearLayoutPanel(750,500);
		
		JLabel qLabel = new JLabel("Enter All Questions");

		JLabel aLabel = new JLabel("Enter All Anwsers");
		
		qp.addAsRow(qLabel);
		ap.addAsRow(aLabel);
		
		for(int i = 0 ; i< 13; i++) {
			JTextField q = new JTextField(60);
			qp.addAsRow(q);
			questionList[i] = q;
			
			JTextField a = new JTextField(60);
			
			ap.addAsRow(a);
			answerList[i] = a;
		}
		
		add(qp);
		add(ap);
	}
	public void setGMQuestionList() {
		String [] list = new String[getNumberOfQuestion()];
		String [] list2 = new String[list.length];
		int count = 0;
	
		while(count <list.length) {
			String s = questionList[count].getText();
			list[count] = s;
			
			list2[count] = answerList[count].getText();
			if(s.length()==0) {
				break;
			}
			count++;
		}
		GameManager.setQuestionAnswerList(list,list2);
	}
	public int getNumberOfQuestion() {
		
		int count = 0;
		while(count <13) {
			String s = questionList[count].getText();
			if(s.length()==0) {
				break;
			}
			count++;
		}
		return count;
	}
}

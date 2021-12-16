import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
public class QuestionBox extends JButton {
	private boolean isOpened;
	QuestionBox(int i, int boxSize){
		isOpened= false;
		setText(""+i);
		 setPreferredSize(new Dimension(2000/(GameManager.getQuestionList().length +GameManager.getItemList().length), 300));
		 setFont(new Font("Arial", Font.PLAIN, 40));
	}
}

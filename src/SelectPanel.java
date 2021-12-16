import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelectPanel extends JPanel{
	
	SelectPanel(){
		System.out.println(GameManager.getNumberOfPlayer());

		System.out.println(GameManager.getQuestionList().length);
		System.out.println(GameManager.getItemList().length);
		LinearLayoutPanel playerRow = new LinearLayoutPanel(1500, 100);
		for(int i = 0; i< GameManager.getNumberOfPlayer(); i++) {
			LinearLayoutPanel player = new LinearLayoutPanel(1500/(GameManager.getNumberOfPlayer()+1), 90);
			int innerw= 1500/(GameManager.getNumberOfPlayer()+1);
			player.addAsRow(new JLabel("Player"+(1+i)));
			player.addAsRow(new JLabel(""+0));
			playerRow.add(player);
		}
		add(playerRow);
		
		for(int i = 0 ; i<GameManager.getQuestionList().length +GameManager.getItemList().length; i++ ) {
			QuestionBox qb = new QuestionBox(i, GameManager.getQuestionList().length +GameManager.getItemList().length);
			add(qb);
		}
	}
}

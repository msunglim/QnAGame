import javax.swing.JFrame;
import javax.swing.WindowConstants;
public class MyFrame extends JFrame {
	MyFrame() {
		super();

		MyPanel p = new MyPanel();
		add(p);

		setTitle("파머스 영어 교육용 게임");
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(1500, 800);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
}

import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class ItemSettingPanel extends LinearLayoutPanel {
	private JCheckBox[] list = new JCheckBox[6];

	ItemSettingPanel(int w, int h) {
		super(w, h);
		// TODO Auto-generated constructor stub
		JLabel itemLabel = new JLabel("아이템리스트:");
		add(itemLabel);
		for (int i = 0; i < 6; i++) {
			JCheckBox checkbox = new JCheckBox("item" + i);
			list[i] = checkbox;
			add(checkbox);
		}
	}

	public void setGMItemList() {
		String[] itemlist = new String[getNumberOfCheckedbox()];
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			JCheckBox cb = list[i];
			if (cb.isSelected()) {
				itemlist[count] = list[i].getText();
				count++;
				
			}
		}
		GameManager.setItemList(itemlist);
	}

	public int getNumberOfCheckedbox() {
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			JCheckBox cb = list[i];
			if (cb.isSelected()) {
				count++;
			}
		}
		return count;
	}

}

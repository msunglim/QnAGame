package Panel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

import Gui.GameManager;
import Gui.Item;
import Gui.LinearLayoutPanel;

public class ItemSettingPanel extends LinearLayoutPanel {
	private JCheckBox[] list = new JCheckBox[6];
	private Item[] allItems;
	public ItemSettingPanel(int w, int h) {
		super(w, h);
		// TODO Auto-generated constructor stub
		JLabel itemLabel = new JLabel("Item List:");
		add(itemLabel);
		
		Item item1 = new Item("Other Heal","hai");
		Item item2 = new Item("Other damage","ah?");
		Item item3 = new Item("Me Heal","haha");
		Item item4 = new Item("Me damage","What");
		Item item5 = new Item("Swap points","?!");
		Item item6 = new Item("Get Random Point","....");
		allItems = new Item[]{item1, item2, item3, item4, item5, item6};
		for (int i = 0; i < 6; i++) {
			JCheckBox checkbox = new JCheckBox("item" + i);
			list[i] = checkbox;
			add(checkbox);
		}
	}

	public void setGMItemList() {
		Item[] itemlist = new Item[getNumberOfCheckedbox()];
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			JCheckBox cb = list[i];
			if (cb.isSelected()) {
				itemlist[count] = allItems[i];
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

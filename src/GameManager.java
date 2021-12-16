
public class GameManager {

	private static String[] questionList;
	private static String[] itemList;
	private static int numberOfplayer;

	public static void setNumberOfPlayer(int n) {
		numberOfplayer = n;
	}

	public static void setQuestionList(String[] list) {
		questionList = list;
	}

	// will be changed to Item[]
	public static void setItemList(String[] list) {
		itemList = list;
	}
	public static int getNumberOfPlayer() {
		return numberOfplayer;
	}
	public static String[] getQuestionList() {
		return questionList;
	}
	public static String [] getItemList() {
		return itemList;
	}
}

package Gui;
public class GameManager {

	private static String[] questionList;
	private static String[] answerList;
	
	private static Item[] itemList;
	
	private static int numberOfplayer;
	private static Player[] playerList;
	private static int currentPlayerIndex;
	
	private static String [] allTitle;
	private static String [] allDescription;
	public static void setNumberOfPlayer(int n) {
		numberOfplayer = n;
	}

	public static void setQuestionAnswerList(String[] list, String [] list2) {
		questionList = list;
		answerList = list2;
	}

	// will be changed to Item[]
	public static void setItemList(Item[] list) {
		itemList = list;
	}
	public static void setPlayerList() {
		playerList = new Player[numberOfplayer];
		for(int i = 0; i < playerList.length; i++) {
			playerList[i] = new Player();
		}
		currentPlayerIndex = 0;
	}
	public static Player getCurrentPlayer() {
		return playerList[currentPlayerIndex];
	}
	public static Player getNextPlayer() {
		if(currentPlayerIndex+1 < playerList.length) {
			return playerList[currentPlayerIndex+1];
		}else {
			
			return playerList[0];
		}
	}
	public static void nextPlayer() {
	if(currentPlayerIndex+1 < playerList.length) {
			
			 currentPlayerIndex++;
		}else {
			 currentPlayerIndex=0;
		}
	}
	public static int getNextPlayerIndex() {
		if(currentPlayerIndex+1 < playerList.length) {
			
			return currentPlayerIndex++;
		}else {
			return 0;
		}
	}
	public static int getPreviousPlayerIndex() {
		if(currentPlayerIndex -1 <0) {
			return playerList.length-1;
		}else {
			return currentPlayerIndex-1;
		}
	}
	public static int getCurrentPlayerIndex() {
		return currentPlayerIndex;
	}
	public static int getNumberOfPlayer() {
		return numberOfplayer;
	}
	public static Player[] getPlayerList() {
		return playerList;
	}
	public static String[] getQuestionList() {
		return questionList;
	}
	public static Item [] getItemList() {
		return itemList;
	}
	public static void setAllTD() {
		//set all title first
		allTitle = new String[questionList.length + itemList.length];
		allDescription= new String[questionList.length + itemList.length];
		for(int i =0; i <questionList.length; i++) {
			allTitle[i] = questionList[i];
			allDescription[i]= answerList[i];
		}
		for(int i =questionList.length; i< questionList.length+itemList.length; i++) {
			allTitle[i] = itemList[i-questionList.length].getTitle();
			allDescription[i]= itemList[i-questionList.length].getEffect();
		}
		
		//randomly mix
		for(int i = 0; i< allTitle.length; i++) {
			int random = (int)Math.random()*allTitle.length;
			String tmp = allTitle[random];
			allTitle[random] = allTitle[i];
			allTitle[i] = tmp;
			
			String tmp2 = allDescription[random];
			allDescription[random]= allDescription[i];
			allDescription[i] = tmp2;
		}
	
	
	}
	public static String[] getAllTitle() {
		return allTitle;
	}
	public static String[] getAllDescription() {
		return allDescription;
	}
}

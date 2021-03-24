import java.util.ArrayList;

import java.io.Serializable;

public class BacarratInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	int currentBalance = 10000;
	boolean chosePlayer = false;
	boolean choseBanker = false;
	boolean choseTie = false;
	double currentBet = 0;
	boolean isPlayingAgain = false;
	boolean isPlayingTheGame = false;
	
	public int pointsForCurrentDeck(ArrayList<Card> thisHand) {
		int totalPoints = BacarratGameLogic.handTotal(thisHand);
		
		return totalPoints;
	}
	
	public String indentifyCard(Card thisCard) {
		String theCard = "";
		theCard += thisCard.value;
		theCard += " Of ";
		theCard += thisCard.suite;
		
		return theCard;
	}
	
	public String displayBetDecision() {
		String betDecision = " on the ";
		
		if(choseBanker == true) {
			betDecision += "Banker.";
		} else if (chosePlayer == true) {
			betDecision += "Player.";
		} else if (choseTie) {
			betDecision += "Tie.";
		}
		return betDecision;
	}
	
	public String displayPlayerDeckMessage(ArrayList<Card> thisHand) {
		String theString = "Players hand is currently : \n";
		int i = 0;
		for(Card cards : thisHand) {
			theString += cards.value;
			theString += " Of ";
			theString += cards.suite;
			if(i < thisHand.size() - 1) {
				theString += " and ";
			}
			i++;
		}
		theString += "\nPlayers Points: " + BacarratGameLogic.handTotal(thisHand);
		return theString;
	}
	
	public String displayBankersDeckMessage(ArrayList<Card> bankersHand) {
		String theString = "Bankers hand is currently : \n";
		int i = 0;
		for(Card cards : bankersHand) {
			theString += cards.value;
			theString += " Of ";
			theString += cards.suite;
			if(i < bankersHand.size() - 1) {
				theString += " and ";
			}
			i++;
		}
		theString += "\nBanker Points: " + BacarratGameLogic.handTotal(bankersHand);
		return theString;
	}
	
	public void chooseBanker() {
		choseBanker = true;
		chosePlayer = false;
		choseTie = false;
	}
	public void choosePlayer() {
		choseBanker = false;
		chosePlayer = true;
		choseTie = false;
	}
	
	public void chooseTie() {
		choseBanker = false;
		chosePlayer = false;
		choseTie = true;
	}
	
	
	
}

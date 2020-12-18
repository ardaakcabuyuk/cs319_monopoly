package GameLogic;

import java.util.ArrayList;

public class Card {

    //constants
    private final String TEXT;
    private final int CARDNUM;


    //variables
    private CardStrategy cardStrategy;
    private int toPay;
    private int toEarn;
    private int toMove;
    private Player interactedPlayer;
    private boolean toPlayer;
    private boolean toBank;
    private int moveTo;


    //constructor


    public Card(String TEXT, int CARDNUM, CardStrategy cardStrategy, int toPay, int toEarn, int toMove, boolean toPlayer, boolean toBank, int moveTo) {
        this.TEXT = TEXT;
        this.CARDNUM = CARDNUM;
        this.cardStrategy = cardStrategy;
        this.toPay = toPay;
        this.toEarn = toEarn;
        this.toMove = toMove;
        this.toPlayer = toPlayer;
        this.toBank = toBank;
        this.moveTo = moveTo;
    }

    //methods
    // This method executes the card.
    // TODO will be implemented.
    public boolean executeCard(){
        cardStrategy.executeCard(this, interactedPlayer);
        return true;
    }

    //GETTERS AND SETTERS
    public String getText() { return TEXT; }

    public int getCARDNUM() {
        return CARDNUM;
    }

    public CardStrategy getCardStrategy() {
        return cardStrategy;
    }

    public int getToPay() {
        return toPay;
    }

    public int getToEarn() {
        return toEarn;
    }

    public int getToMove() {
        return toMove;
    }

    public Player getInteractedPlayer() {
        return interactedPlayer;
    }

    public boolean isToPlayer() {
        return toPlayer;
    }

    public boolean isToBank() {
        return toBank;
    }

    public int getMoveTo() {
        return moveTo;
    }
}

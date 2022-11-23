package com.nology.cardgame;

public class Card {

    String suit;
    String symbol;
    int value;

    public void setSuit(String suit) {
//        if ()     //suit is in list(Array? enum? of valid suits
        this.suit = suit;
    }
    public String getSuit() {
        return suit;
    }

    public void setSymbol(String symbol) {
//        if ()     //Symbol is in (range/List/Array/Enum?) of valid options.
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setValue(int value) {
        if (2 <= value && value <= 14) {    //Easier since it's a fixed range, but
                                            // I'm sure there's some kind of generator for those?
            this.value = value;
        } //else raise some kind of error/exception?
    }
    public int getValue() {
        return value;
    }

    public Card(String suit, String symbol, int value) {
        setSuit(suit);
        setSymbol(symbol);
        setValue(value);
    }

    @Override
    public String toString() {
        return suit + " " + symbol + "/" + value;
        //Replace with a format when possible.
    }
}
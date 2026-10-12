package ru.mirea.sobolevle.magic;

public abstract class Card {
    private String name;
    private ManaCost manaCost;
    private CardType cardType;
    private String setTitle;
    private String oracleText;

    public Card(String name, ManaCost manaCost, CardType cardType, String setTitle, String oracleText) {
        this.name = name;
        this.manaCost = manaCost;
        this.cardType = cardType;
        this.setTitle = setTitle;
        this.oracleText = oracleText;
    }

    public Card() {
    }

    public String getName() {
        return name;
    }

    public ManaCost getManaCost() {
        return manaCost;
    }

    public CardType getCardType() {
        return cardType;
    }

    public String getSetTitle() {
        return setTitle;
    }

    public String getOracleText() {
        return oracleText;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", manaCost=" + manaCost +
                ", cardType=" + cardType +
                ", setTitle='" + setTitle + '\'' +
                ", oracleText='" + oracleText + '\'' +
                '}';
    }
}

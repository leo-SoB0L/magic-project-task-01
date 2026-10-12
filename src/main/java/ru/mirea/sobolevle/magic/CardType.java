package ru.mirea.sobolevle.magic;

public class CardType {
    private SuperType superType;
    private String type;
    private String subType;

    public CardType(SuperType superType, String type, String subType) {
        this.superType = superType;
        this.type = type;
        this.subType = subType;
    }

    public CardType() {
    }

    public SuperType getSuperType() {
        return superType;
    }

    public String getType() {
        return type;
    }

    public String getSubType() {
        return subType;
    }

    @Override
    public String toString() {
        return "CardType{" +
                "superType=" + superType +
                ", type='" + type + '\'' +
                ", subType='" + subType + '\'' +
                '}';
    }
}

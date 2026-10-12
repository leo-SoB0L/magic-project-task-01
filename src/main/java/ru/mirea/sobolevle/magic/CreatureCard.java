package ru.mirea.sobolevle.magic;

import java.util.ArrayList;
import java.util.List;

public class CreatureCard extends Card implements HasAbility, DamageDealer, Damagable, Blocker, Attacker {
    private int power;
    private int toughness;
    private List<Ability> abilities;

    public CreatureCard(String name, ManaCost manaCost, CardType cardType, String setTitle,
                        String oracleText, int power, int toughness, List<Ability> abilities) {
        super(name, manaCost, cardType, setTitle, oracleText);
        this.power = power;
        this.toughness = toughness;
        this.abilities = new ArrayList<>(abilities);
    }

    public CreatureCard() {
        this.abilities = new ArrayList<>();
    }

    public int getPower() {
        return power;
    }

    public int getToughness() {
        return toughness;
    }

    @Override
    public List<Ability> getAbilities() {
        return abilities;
    }

    @Override
    public void addAbility(Ability ability) {
        abilities.add(ability);
    }

    @Override
    public void dealDamage(int damage, Damagable target) {
    }

    @Override
    public void takeDamage(int damage) {
    }

    @Override
    public void block(CreatureCard attacker) {
    }

    @Override
    public void attack() {
    }

    @Override
    public String toString() {
        return "CreatureCard{" +
                "power=" + power +
                ", toughness=" + toughness +
                ", abilities=" + abilities +
                "} " + super.toString();
    }
}

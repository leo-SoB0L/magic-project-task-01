package ru.mirea.sobolevle.magic;

import java.util.List;
import java.util.Map;

public class MagicApplication {
    public static void main(String[] args) {
        // Пример на карте Astarion, the Decadent. Замените данные на свою карточку.
        ManaCost manaCost = new ManaCost(4, Map.of(ManaType.WHITE, 1, ManaType.BLACK, 1));
        CardType cardType = new CardType(SuperType.LEGENDARY, "Creature", "Vampire Elf Rogue");

        CreatureCard card = new CreatureCard(
                "Astarion, the Decadent", manaCost, cardType, "CLB",
                "Deathtouch, lifelink", 4, 4, List.of());

        Student student = new Student("Фамилия", "Имя", "Группа", card);

        System.out.println("Студент: " + student.getLastName() + " "
                + student.getFirstName() + ", группа " + student.getGroup());
        System.out.println("Карта: " + student.getCard().getName());
        System.out.println("Мана-стоимость: " + student.getCard().getManaCost());
        System.out.println("Тип: " + student.getCard().getCardType());
        System.out.println(card);
    }
}

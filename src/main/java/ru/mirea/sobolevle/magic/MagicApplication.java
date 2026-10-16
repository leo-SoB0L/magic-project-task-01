package ru.mirea.sobolevle.magic;

import java.util.List;
import java.util.Map;

public class MagicApplication {
    public static void main(String[] args) {
        // 1. Простая информация о карте (карта: Jet, Rebel Leader, набор TLE)
        String name = "Jet, Rebel Leader";
        String setTitle = "TLE";
        String oracleText = "Whenever Jet attacks, look at the top five cards of your library. "
                + "You may put a creature card with mana value 3 or less from among them "
                + "onto the battlefield tapped and attacking. "
                + "Put the rest on the bottom of your library in a random order.";
        int power = 3;
        int toughness = 4;

        // 2. Способностей-ключевых слов (Flying, Haste и т.п.) на карточке нет,
        //    поэтому классы способностей не создаём, список способностей пустой.

        // 3. Тип и мана-стоимость: {3}{W}, легендарное существо
        CardType cardType = new CardType(SuperType.LEGENDARY, "Creature", "Human Rebel Ally");
        ManaCost manaCost = new ManaCost(3, Map.of(ManaType.WHITE, 1));

        // 4. Существо
        CreatureCard creature = new CreatureCard(
                name, manaCost, cardType, setTitle, oracleText, power, toughness, List.of());

        // 5. Студент (замените на свои данные)
        Student student = new Student("Соболев", "Леонид", "БСБО-54-25", creature);

        // Вывод: все данные берём из полей соответствующих классов
        System.out.println("Студент: " + student.getLastName() + " " + student.getFirstName()
                + ", группа " + student.getGroup());

        Card card = student.getCard();
        System.out.println("Карта: " + card.getName());
        System.out.println("Мана-стоимость: " + formatManaCost(card.getManaCost()));
        System.out.println("Типы: " + card.getCardType().getSuperType() + ", "
                + card.getCardType().getType() + ", " + card.getCardType().getSubType());
        System.out.println("Сила/выносливость: " + creature.getPower() + "/" + creature.getToughness());

        if (creature.getAbilities().isEmpty()) {
            System.out.println("Способности: нет");
        } else {
            for (Ability ability : creature.getAbilities()) {
                System.out.println("Способность: " + ability.getClass().getSimpleName());
            }
        }
    }

    // Превращает ManaCost в формат {3}{W}
    private static String formatManaCost(ManaCost cost) {
        StringBuilder result = new StringBuilder();
        if (cost.getGenericMana() > 0) {
            result.append("{").append(cost.getGenericMana()).append("}");
        }
        for (ManaType type : ManaType.values()) {
            int count = cost.getColoredMana().getOrDefault(type, 0);
            for (int i = 0; i < count; i++) {
                result.append("{").append(type.getSymbol()).append("}");
            }
        }
        return result.toString();
    }
}

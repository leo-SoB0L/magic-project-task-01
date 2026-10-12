package ru.mirea.sobolevle.magic;

import java.util.List;

public interface HasAbility {
    List<Ability> getAbilities();

    void addAbility(Ability ability);
}

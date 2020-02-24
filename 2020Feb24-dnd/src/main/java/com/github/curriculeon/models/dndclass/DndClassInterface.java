package com.github.curriculeon.models.dndclass;

import com.github.curriculeon.models.*;

import java.util.List;

/**
 * Created by leon on 2/24/2020.
 */

public interface DndClassInterface {
    String getName();

    void setName(String name);

    HitDie getHitDie();

    void setHitDie(HitDie hitDie);

    AbilityType getPrimaryAbilityType();


    ArmorType getArmor();

    void setArmor(ArmorType armor);

    WeaponType getWeaponType();

    void setWeaponType(WeaponType weaponType);
}

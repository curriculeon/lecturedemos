package com.github.curriculeon.models.dndclass;

import com.github.curriculeon.models.*;

import java.util.Arrays;

/**
 * Created by leon on 2/24/2020.
 */
public class Bard extends DndClass {
    public Bard() {
        super(
                "Bard",
                new HitDie(8),
                AbilityType.CHARISMA,
                Arrays.asList(SkillType.DEXTERITY, SkillType.CHARISMA),
                ArmorType.LEATHER,
                WeaponType.LIGHT,
                Arrays.asList(SkillType.CHARISMA));
    }
}

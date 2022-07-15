package com.github.curriculeon.models.race;

import com.github.curriculeon.models.AbilityBoost;

public interface DndRaceInterface {
    Integer getAge();

    void setAge(Integer age);

    Integer getSpeed();

    void setSpeed(Integer speed);

    String getName();

    void setName(String name);

    String getSize();

    void setSize(String size);

    AbilityBoost getAbilityBoost();

    void setAbilityBoost(AbilityBoost abilityBoost);
}

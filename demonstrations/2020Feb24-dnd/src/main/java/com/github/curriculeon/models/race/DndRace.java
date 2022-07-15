package com.github.curriculeon.models.race;

import com.github.curriculeon.models.AbilityBoost;
import com.github.curriculeon.models.race.DndRaceInterface;

/**
 * Created by leon on 2/24/2020.
 */
public class DndRace implements DndRaceInterface {
    private Integer age;
    private Integer speed;
    private String name;
    private String size;
    private AbilityBoost abilityBoost;

    public DndRace(Integer age, Integer speed, String name, String size, AbilityBoost abilityBoost) {
        this.age = age;
        this.speed = speed;
        this.name = name;
        this.size = size;
        this.abilityBoost = abilityBoost;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Integer getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public AbilityBoost getAbilityBoost() {
        return abilityBoost;
    }

    @Override
    public void setAbilityBoost(AbilityBoost abilityBoost) {
        this.abilityBoost = abilityBoost;
    }
}

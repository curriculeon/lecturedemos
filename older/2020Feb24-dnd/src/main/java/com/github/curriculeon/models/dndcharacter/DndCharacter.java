package com.github.curriculeon.models.dndcharacter;

import com.github.curriculeon.models.Inventory;
import com.github.curriculeon.models.Skill;
import com.github.curriculeon.models.Stats;
import com.github.curriculeon.models.dndclass.DndClass;
import com.github.curriculeon.models.race.DndRace;

import java.util.List;

/**
 * Created by leon on 2/24/2020.
 */
public class DndCharacter implements DndCharacterInterface {
    private String name;
    private String alignment;
    private Double exp;
    private Inventory inventory;
    private Stats stats;
    private DndRace race;
    private DndClass dnDClass;
    private List<Skill> skillList;

    public DndCharacter(String name, String alignment, Double exp, Inventory inventory, Stats stats, DndRace race, DndClass dnDClass, List<Skill> skillList) {
        this.name = name;
        this.alignment = alignment;
        this.exp = exp;
        this.inventory = inventory;
        this.stats = stats;
        this.race = race;
        this.dnDClass = dnDClass;
        this.skillList = skillList;
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
    public String getAlignment() {
        return alignment;
    }

    @Override
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    @Override
    public Double getExp() {
        return exp;
    }

    @Override
    public void setExp(Double exp) {
        this.exp = exp;
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public Stats getStats() {
        return stats;
    }

    @Override
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @Override
    public DndRace getRace() {
        return race;
    }

    @Override
    public void setRace(DndRace race) {
        this.race = race;
    }

    @Override
    public DndClass getDnDClass() {
        return dnDClass;
    }

    @Override
    public void setDnDClass(DndClass dnDClass) {
        this.dnDClass = dnDClass;
    }

    @Override
    public List<Skill> getSkillList() {
        return skillList;
    }

    @Override
    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }
}

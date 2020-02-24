package com.github.curriculeon.models.dndcharacter;

import com.github.curriculeon.models.*;
import com.github.curriculeon.models.dndclass.DndClass;
import com.github.curriculeon.models.race.DndRace;

import java.util.List;

public interface DndCharacterInterface {
    String getName();

    void setName(String name);

    String getAlignment();

    void setAlignment(String alignment);

    Double getExp();

    void setExp(Double exp);

    Inventory getInventory();

    void setInventory(Inventory inventory);

    Stats getStats();

    void setStats(Stats stats);

    DndRace getRace();

    void setRace(DndRace race);

    DndClass getDnDClass();

    void setDnDClass(DndClass dnDClass);

    List<Skill> getSkillList();

    void setSkillList(List<Skill> skillList);
}

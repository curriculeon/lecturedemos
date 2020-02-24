package com.github.curriculeon.models.dndclass;

import com.github.curriculeon.models.*;

import java.util.List;

/**
 * Created by leon on 2/24/2020.
 */
public class DndClass implements DndClassInterface {
    private String name;
    private HitDie hitDie;
    private AbilityType primaryAbilityType;
    private List<SkillType> savingThrowProficiency;
    private ArmorType armor;
    private WeaponType weaponType;
    private List<SkillType> proficiencies;

    public DndClass(String name, HitDie hitDie, AbilityType primaryAbilityType, List<SkillType> savingThrowProficiency, ArmorType armor, WeaponType weaponType, List<SkillType> proficiencies) {
        this.name = name;
        this.hitDie = hitDie;
        this.primaryAbilityType = primaryAbilityType;
        this.savingThrowProficiency = savingThrowProficiency;
        this.armor = armor;
        this.weaponType = weaponType;
        this.proficiencies = proficiencies;
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
    public HitDie getHitDie() {
        return hitDie;
    }

    @Override
    public void setHitDie(HitDie hitDie) {
        this.hitDie = hitDie;
    }

    @Override
    public AbilityType getPrimaryAbilityType() {
        return primaryAbilityType;
    }

    public void setPrimaryAbilityType(AbilityType primaryAbilityType) {
        this.primaryAbilityType = primaryAbilityType;
    }

    public void setSavingThrowProficiency(List<SkillType> savingThrowProficiency) {
        this.savingThrowProficiency = savingThrowProficiency;
    }

    @Override
    public ArmorType getArmor() {
        return armor;
    }

    @Override
    public void setArmor(ArmorType armor) {
        this.armor = armor;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public List<SkillType> getSavingThrowProficiency() {
        return savingThrowProficiency;
    }


    public void setProficiencies(List<SkillType> proficiencies) {
        this.proficiencies = proficiencies;
    }

    @Override
    public String toString() {
        return "DndClass{" +
                "name='" + name + '\'' +
                ", hitDie=" + hitDie +
                ", primaryAbilityType=" + primaryAbilityType +
                ", savingThrowProficiency=" + savingThrowProficiency +
                ", armor=" + armor +
                ", weaponType=" + weaponType +
                ", proficiencies=" + proficiencies +
                '}';
    }
}

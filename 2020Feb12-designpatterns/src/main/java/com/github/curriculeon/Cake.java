package com.github.curriculeon;

/**
 * Created by leon on 2/12/2020.
 */
public class Cake {
    private String milk;
    private String eggs;
    private String butter;
    private String icing;
    private String sugar;
    private String flour;
    private String bakingSoda;
    private String vanilla;
    private String salt;

    public Cake(String milk, String eggs, String butter, String icing, String sugar, String flour, String bakingSoda, String vanilla, String salt) {
        this.milk = milk;
        this.eggs = eggs;
        this.butter = butter;
        this.icing = icing;
        this.sugar = sugar;
        this.flour = flour;
        this.bakingSoda = bakingSoda;
        this.vanilla = vanilla;
        this.salt = salt;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getEggs() {
        return eggs;
    }

    public void setEggs(String eggs) {
        this.eggs = eggs;
    }

    public String getButter() {
        return butter;
    }

    public void setButter(String butter) {
        this.butter = butter;
    }

    public String getIcing() {
        return icing;
    }

    public void setIcing(String icing) {
        this.icing = icing;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getBakingSoda() {
        return bakingSoda;
    }

    public void setBakingSoda(String bakingSoda) {
        this.bakingSoda = bakingSoda;
    }

    public String getVanilla() {
        return vanilla;
    }

    public void setVanilla(String vanilla) {
        this.vanilla = vanilla;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}

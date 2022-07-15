package com.github.curriculeon;

public class CakeBuilder {
    private String milk;
    private String eggs;
    private String butter;
    private String icing;
    private String sugar;
    private String flour;
    private String bakingSoda;
    private String vanilla;
    private String salt;

    public CakeBuilder setMilk(String milk) {
        this.milk = milk;
        return this;
    }

    public CakeBuilder setEggs(String eggs) {
        this.eggs = eggs;
        return this;
    }

    public CakeBuilder setButter(String butter) {
        this.butter = butter;
        return this;
    }

    public CakeBuilder setIcing(String icing) {
        this.icing = icing;
        return this;
    }

    public CakeBuilder setSugar(String sugar) {
        this.sugar = sugar;
        return this;
    }

    public CakeBuilder setFlour(String flour) {
        this.flour = flour;
        return this;
    }

    public CakeBuilder setBakingSoda(String bakingSoda) {
        this.bakingSoda = bakingSoda;
        return this;
    }

    public CakeBuilder setVanilla(String vanilla) {
        this.vanilla = vanilla;
        return this;
    }

    public CakeBuilder setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public Cake build() {
        return new Cake(milk, eggs, butter, icing, sugar, flour, bakingSoda, vanilla, salt);
    }
}
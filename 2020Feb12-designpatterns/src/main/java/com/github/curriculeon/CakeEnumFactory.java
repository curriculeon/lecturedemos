package com.github.curriculeon;

/**
 * Created by leon on 2/12/2020.
 */
public enum CakeEnumFactory {
    VANILLA_CAGE_FREE_EGG_CAKE(new CakeBuilder()
            .setEggs("cage free")
            .setVanilla("true")
            .setSugar("2 cups")
            .setSalt("1 cup")
            .setButter("true")),

    SPECIAL_FUNNY_CAKE("2 cups", "1 cup"),
    SPECIAL_FUNNY_SWEET_CAKE("1 cup", null),
    SPECIAL_FUNNY_SALTY_CAKE(null, "1 cup");


    private final CakeBuilder cakeBuilder;
    CakeEnumFactory(String sugar, String salt) {
        this(new CakeBuilder()
                .setEggs("cage free")
                .setVanilla("true")
                .setSugar(sugar)
                .setSalt(salt)
                .setButter("special magical butters"));
    }

    CakeEnumFactory(CakeBuilder cakeBuilder) {
        this.cakeBuilder = cakeBuilder;
    }

    public Cake createCake() {
        return cakeBuilder.build();
    }

}
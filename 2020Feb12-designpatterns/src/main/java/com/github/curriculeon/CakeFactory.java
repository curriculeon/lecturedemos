package com.github.curriculeon;

/**
 * Created by leon on 2/12/2020.
 */
public class CakeFactory {
    public static Cake getVanillaCageFreeEggCake() {
        return new CakeBuilder()
                .setEggs("cage free")
                .setVanilla("true")
                .setSugar("2 cups")
                .setSalt("1 cup")
                .setButter("true")
                .build();
    }

    public static Cake getSpecialFunnyCake(String sugar, String salt) {
        return new CakeBuilder()
                .setEggs("cage free")
                .setSugar(sugar)
                .setSalt(salt)
                .setButter("magical butter")
                .build();
    }

    public static Cake getSpecialSweetCake() {
        return getSpecialFunnyCake("lots of sugar", null);
    }

    public static Cake getSpecialSaltyCake() {
        return getSpecialFunnyCake(null, "lots of salt");
    }
}

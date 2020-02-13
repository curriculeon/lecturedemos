package com.github.curriculeon;

public class MyObject implements Runnable {
    public void run() {
        CakeEnumFactory factory = CakeEnumFactory.SPECIAL_FUNNY_CAKE;

        Cake specialFunny1 = factory.createCake();
        Cake specialFunny2 = factory.createCake();

        System.out.println("Factory = " + factory);
        System.out.println("cake = " + specialFunny1);
        System.out.println("cake = " + specialFunny2);
    }
}

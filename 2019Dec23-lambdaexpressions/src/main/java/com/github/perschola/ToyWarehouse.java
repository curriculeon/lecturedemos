package com.github.perschola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 12/30/2019.
 */
public class ToyWarehouse {
    private final List<Toy> inventory;

    public ToyWarehouse() {
        this.inventory = new ArrayList<>();
    }

    public void add(Toy toy) {
        inventory.add(toy);
    }

    public Toy findById(Long id) {
        return inventory
                .stream()
                .filter(toy -> toy.getId().equals(id))
                .findFirst()
                .orElse(new Toy());
    }
}

package com.github.curriculeon.models;

/**
 * Created by leon on 2/24/2020.
 */
public class HitDie {
    int numberOfFaces;

    public HitDie(int numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    public int getNumberOfFaces() {
        return numberOfFaces;
    }

    public void setNumberOfFaces(int numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    @Override
    public String toString() {
        return "HitDie{" +
                "numberOfFaces=" + numberOfFaces +
                '}';
    }
}

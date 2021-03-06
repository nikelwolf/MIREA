package ru.mirea.sidnev.labs.lab4.task1;

public class Animal implements Nameable {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String getName() {
        return animalName;
    }
}

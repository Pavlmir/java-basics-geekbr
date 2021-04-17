package ru.geekbrains.lesson_6;

public abstract class Animal {
    private String name;
    private static int numberObject;

    public Animal(String name) {
        this.name = name;
        this.numberObject = this.numberObject + 1;
    }

    public String getName() {
        return this.name;
    }

    public static int getNumberObject() {
        return numberObject;
    }

    public abstract void run(int lengthDist);

    public abstract void swim(int lengthDist);

}

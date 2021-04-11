package ru.geekbrains.lesson_6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int lengthDist) {
        if (lengthDist < 500) {
            System.out.printf("Собачка %s пробежала %s м. %n", this.getName(), lengthDist);
        } else {
            System.out.printf("Собачка %s не может столько пробежать %n", this.getName());
        }
    }

    @Override
    public void swim(int lengthDist) {
        if (lengthDist < 10) {
            System.out.printf("Собачка %s проплыла %s м. %n", this.getName(), lengthDist);
        } else {
            System.out.printf("Собачка %s не может столько проплыть %n", this.getName());
        }
    }
}

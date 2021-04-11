package ru.geekbrains.lesson_6;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Саймон"),
                new Dog("Шарик"),
                new Dog("Бобик")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(200);
            animals[i].swim(45);
        }

        System.out.printf("Количество объектов %s  %n", Animal.getNumberObject());
    }
}
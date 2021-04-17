package ru.geekbrains.lesson_6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int lengthDist) {
        if (lengthDist < 200){
            System.out.printf("Котик %s пробежал %s м. %n", this.getName(), lengthDist);
        } else {
            System.out.printf("Котик %s не может столько пробежать %n", this.getName());
        }
    }

    @Override
    public void swim(int lengthDist) {
        System.out.printf("Котик %s не умеет плавать %n", this.getName());
    }
}

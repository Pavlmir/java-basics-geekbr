package ru.geekbrains.lesson_7;

public class Cat {
    private StringBuilder name = new StringBuilder();
    private int appetite;
    private boolean hungry = true;

    public Cat(String name, int appetite) {
        this.name.append(name);
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        this.hungry = p.decreaseFood(appetite);
    }

    public void printinfo() {
        if (hungry) {
            System.out.printf("%s голоден %n", name);
        } else {
            System.out.printf("%s сыт %n", name);
        }
    }

    public void allInfo() {
        System.out.printf("%s %s %n", name, appetite);
        printinfo();
    }

    public boolean getHungry() {
        return this.hungry;
    }
}

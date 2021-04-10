package ru.geekbrains.lesson_5;

public class Collaborator {
    private String fullName; // ФИО
    private String position; // должность
    private String email; // электронная почта
    private String phoneNumber; // телефон
    private int salary; // зарплата
    private int age; // возраст

    public Collaborator(String fullName, String position, String email,
                        String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.printf("Сотрудник: %s,%n" +
                        "должность: %s,%n" +
                        "электронная почта: %s,%n" +
                        "телефон: %s,%n" +
                        "зарплата: %s,%n" +
                        "возраст: %s,%n", this.fullName, this.position,
                this.email, this.phoneNumber, this.salary, this.age);
    }

    public int getAge() {
        return this.age;
    }

}
